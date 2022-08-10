import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.Pipe;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        try {
            Pipe pipe = Pipe.open();
            Runnable writer = new Runnable() {
                @Override
                public void run() {
                    try {
                      Pipe.SinkChannel sinkChannel = pipe.sink();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i = 0; i < 10; i++) {
                            String currentTime = "The time is: " + System.currentTimeMillis();

                            buffer.put(currentTime.getBytes());
                            buffer.flip();

                            while (buffer.hasRemaining()) {
                                sinkChannel.write(buffer);
                            }
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch(Exception err) {
                        err.printStackTrace();
                    }
                }
            };

            Runnable reader = new Runnable() {
                @Override
                public void run() {
                    try {
                        Pipe.SourceChannel sourceChannel = pipe.source();
                        ByteBuffer buffer = ByteBuffer.allocate(56);

                        for(int i = 0; i < 10; i++) {
                            int bytesRead = sourceChannel.read(buffer);
                            byte[] timeString = new byte[bytesRead];
                            buffer.flip();
                            buffer.get(timeString);
                            System.out.println("Reader thread: " + new String(timeString));
                            buffer.flip();
                            Thread.sleep(100);
                        }
                    } catch(Exception err) {
                        err.printStackTrace();
                    }
                }
            };

            new Thread(writer).start();
            new Thread(reader).start();

//        try(FileOutputStream binFile = new FileOutputStream("data.dat")) {
//            // Binary format
////            FileOutputStream binFile = new FileOutputStream("data.dat");
//            ByteBuffer buffer = ByteBuffer.allocate(100);
//            FileChannel binChannel = binFile.getChannel();
//            byte[] outputBytes = "Hello World!".getBytes();
//            byte[] outputBytes2 = "Nice to meet you".getBytes();

            // Chained method calls
//            buffer.put(outputBytes).putInt(245).putInt(-98765).put(outputBytes2).putInt(1000);
//            buffer.flip();

            /**
             * read(ByteBuffer) - reads bytes beginning at the channel's current position, and
             *      after the read, updates the position accordingly
             * write(ByteBuffer) - the same as read, except it writes.  There's one exception.
             *      If a datasource is opened in APPEND mode, then the first write will take
             *      place starting at the end of the datasource, rather than position 0.
             *      After the write, the position will be updated accordingly.
             * position() - returns the channel's position.
             * position(long) - sets the channel's position to the passed value.
             * truncate(long) - truncates the size of the attached datasource to the passed value.
             * size() - returns the size of the attached datasource.
             *
             */

//            // Relative writes
//            buffer.put(outputBytes);
//            long int1Pos = outputBytes.length;
//            buffer.putInt(245);
//            long int2Pos = int1Pos + Integer.BYTES;
//            buffer.putInt(-98765);
//            buffer.put(outputBytes2);
//            long int3Pos = int2Pos + Integer.BYTES + outputBytes2.length;
//            buffer.putInt(1000);
//            buffer.flip();
//
//            binChannel.write(buffer);
//
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//
//            // Read in reverse
//            ByteBuffer readBuffer = ByteBuffer.allocate(Integer.BYTES);
//            channel.position(int3Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int3 = " + readBuffer.getInt());
//
//            readBuffer.flip(); // must flip before printout
//            channel.position(int2Pos);
//            channel.read(readBuffer);
//            readBuffer.flip(); // must flip after reading buffer
//            System.out.println("int2 = " + readBuffer.getInt());
//
//            readBuffer.flip();
//            channel.position(int1Pos);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            System.out.println("int1 = " + readBuffer.getInt());

            // FileChannel copy
//            RandomAccessFile copyFile = new RandomAccessFile("datacopy.dat", "rw");
//            FileChannel copyChannel = copyFile.getChannel();
//            channel.position(0); // must set absolute position
////            long numTransferred = copyChannel.transferFrom(channel, 0, channel.size());
//            long numTransferred = channel.transferTo(0, channel.size(), copyChannel);
//            System.out.println("Num transferred = " + numTransferred);
//
//            channel.close();
//            ra.close();
//            copyChannel.close();

            // Random access write
//            byte[] outputString = "Hello, World!".getBytes();
//            long str1Pos = 0;
//            long newInt1Pos = 0;
//            long newInt2Pos = outputString.length;
//            byte[] outputString2 = "Nice to meet you".getBytes();
//            long str2Pos = newInt2Pos + Integer.BYTES;
//            long newInt3Pos = str2Pos + outputString2.length;
//
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip();
//            binChannel.position(newInt1Pos);
//            binChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            binChannel.position(newInt2Pos);
//            binChannel.write(intBuffer);
//
//            intBuffer.flip();
//            intBuffer.putInt(1000);
//            intBuffer.flip();
//            binChannel.position(newInt3Pos);
//            binChannel.write(intBuffer);
//
//            binChannel.position(str1Pos);
//            binChannel.write(ByteBuffer.wrap(outputString));
//            binChannel.position(str2Pos);
//            binChannel.write(ByteBuffer.wrap(outputString2));

//            ByteBuffer readBuffer = ByteBuffer.allocate(100);
//            channel.read(readBuffer);
//            readBuffer.flip();
//            byte[] inputString = new byte[outputBytes.length];
//            readBuffer.get(inputString);
//            System.out.println("inputSTring = " + new String(inputString));
//            System.out.println("in1 = " + readBuffer.getInt());
//            System.out.println("int2 = " + readBuffer.getInt());
//            byte[] inputString2 = new byte[outputBytes2.length];
//            readBuffer.get(inputString2);
//            System.out.println("inputString 2 = " + new String(inputString2));
//            System.out.println("int3 = " + readBuffer.getInt());

            // Wraps byte array into the buffer, modifications to the buffer will change the array
//            ByteBuffer buffer = ByteBuffer.wrap(outputBytes);
//            ByteBuffer buffer = ByteBuffer.allocate(outputBytes.length);
//            buffer.put(outputBytes);
//
//            buffer.flip();
//            int numBytes = binChannel.write(buffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            // Telling the buffer what size to be
//            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
//            intBuffer.putInt(245);
//            intBuffer.flip(); // reset position to 0
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);
//
//            intBuffer.flip();
//            intBuffer.putInt(-98765);
//            intBuffer.flip();
//            numBytes = binChannel.write(intBuffer);
//            System.out.println("numBytes written was: " + numBytes);

            // JavaIO random access class
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            byte[] b = new byte[outputBytes.length];
//            ra.read(b);
//            System.out.println(new String(b));
//            long int1 = ra.readInt();
//            long int2 = ra.readInt();
//            System.out.println(int1);
//            System.out.println(int2);

            // JavaNIO random access class
//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            FileChannel channel = ra.getChannel();
//            outputBytes[0] = 'a';
//            outputBytes[1] = 'b';
//            buffer.flip();
//            long numBytesRead = channel.read(buffer);
//            if (buffer.hasArray()) {
//                System.out.println("byte buffer = " + new String(buffer.array()));
////                System.out.println("byte buffer = " + new String(outputBytes));
//            }
//
//            // Absolute read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            System.out.println(intBuffer.getInt(0));
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt(0));
//            System.out.println(intBuffer.getInt()); // reading the same int twice (relative read)
            // Absolute read does not change the buffers position

            // Relative read
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());
//            intBuffer.flip();
//            numBytesRead = channel.read(intBuffer);
//            intBuffer.flip();
//            System.out.println(intBuffer.getInt());

//            channel.close();
//            ra.close();
//            System.out.println("outputBytes = " + new String(outputBytes));


            // Create file input stream
//            FileInputStream file = new FileInputStream("data.txt");
            // Get a file channel
//            FileChannel channel = file.getChannel();
            // Create buffer to read from file
            // must specify the size of buffer to read how many bytes at one time

//            Path dataPath = FileSystems.getDefault().getPath("data.txt");
//            // Files.write uses bytes and doesn't use the string directly
//            Files.write(dataPath, "\nLine 5".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
//            List<String> lines = Files.readAllLines(dataPath);
//            for(String line : lines) {
//                System.out.println(line);
//            }

        } catch(IOException err) {
            err.printStackTrace();
        }
    }
}