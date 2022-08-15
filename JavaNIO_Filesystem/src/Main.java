import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Main {
    public static void main(String[] args) {
//        Path path = FileSystems.getDefault().getPath("workingDirectoryFile.txt");
//        printFile(path);
//
////        Path filePath = FileSystems.getDefault().getPath("files", "SubdirectoryFile.txt");
//        Path filePath = Paths.get(".","files", "SubdirectoryFile.txt");
//
//        printFile(filePath);
//
////        filePath = Paths.get("C:\\", "Users", "gistadr", "Documents", "Udemy_Java_Programming_Masterclass". "OutThere.txt");
//        filePath = Paths.get("C:\\Users\\gistadr\\Documents\\Udemy_Java_Programming_Masterclass\\OutThere.txt");
//
//        printFile(filePath);
//
//        filePath = Paths.get(".");
//        System.out.println(filePath.toAbsolutePath());
//
//        Path path2 = FileSystems.getDefault().getPath(".", "files", "..", "files", "SubdirectoryFile.txt");
//        System.out.println(path2.normalize().toAbsolutePath());
//        printFile(path2.normalize());
//
//        Path path3 = FileSystems.getDefault().getPath("thisfiledoesntexist.txt");
//        System.out.println(path3.toAbsolutePath());
//
//        Path path4 = Paths.get("Z:\\Volumens\\Test\\ING", "abcdef", "whatever.txt");
//        System.out.println(path4.toAbsolutePath());
//
//        filePath = FileSystems.getDefault().getPath("files");
//        System.out.println("Exists = " + Files.exists(filePath));
//        System.out.println("Exists = " + Files.exists(path4));

        try {
//            Path sourceFile = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path copyFile = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);
//
//            sourceFile = FileSystems.getDefault().getPath("Examples", "Dir1");
//            copyFile = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.copy(sourceFile, copyFile, StandardCopyOption.REPLACE_EXISTING);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1copy.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.move(fileToMove, destination);

//            Path fileToMove = FileSystems.getDefault().getPath("Examples", "file1.txt");
//            Path destination = FileSystems.getDefault().getPath("Examples", "Dir1", "file2.txt");
//            Files.move(fileToMove, destination);

//            Path fileToDelete = FileSystems.getDefault().getPath("Examples", "Dir1", "file1copy.txt");
//            Files.delete(fileToDelete); // or Files.deleteIfExists(filename);

//            Path fileToCreate = FileSystems.getDefault().getPath("Examples", "file2.txt");
//            Files.createFile(fileToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir4");
//            Files.createDirectory(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples", "Dir2\\Dir3\\Dir4\\Dir5\\Dir6");
//            Files.createDirectories(dirToCreate);

//            Path dirToCreate = FileSystems.getDefault().getPath("Examples\\Dir2\\Dir3\\Dir4\\Dir5\\Dir6\\Dir7");
//            Files.createDirectories(dirToCreate);

            Path filePath = FileSystems.getDefault().getPath("Examples", "Dir1\\file1.txt");
            long size = Files.size(filePath);
            System.out.println("Size = " + size);

            System.out.println("Last modified = " + Files.getLastModifiedTime(filePath));

            BasicFileAttributes attrs = Files.readAttributes(filePath, BasicFileAttributes.class);
            System.out.println("Size = " + attrs.size());
            System.out.println("Last modified = " + attrs.lastModifiedTime());
            System.out.println("Created = " + attrs.creationTime());
            System.out.println("Is directory = " + attrs.isDirectory());
            System.out.println("Is regular file = " + attrs.isRegularFile());

        } catch(IOException err) {
            err.printStackTrace();
        }
    }

    // Read contents of a file and output them on screen
    private static void printFile(Path path) {
        try (BufferedReader fileReader = Files.newBufferedReader(path)) {
            String line;
            while((line = fileReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch(IOException err) {
            System.out.println(err.getMessage());
            err.printStackTrace();
        }
    }
}