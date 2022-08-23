package com.threads_section;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;

import static com.threads_section.Main.EOF;

public class Main {
    public static final String EOF = "EOF";

    public static void main(String[] args) {
        ArrayBlockingQueue<String> buffer = new ArrayBlockingQueue<String>(6);
        ReentrantLock bufferLock = new ReentrantLock();

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        MyProducer producer = new MyProducer(buffer, ThreadColor.ANSI_PURPLE);
        MyConsumer consumer1 = new MyConsumer(buffer, ThreadColor.ANSI_GREEN);
        MyConsumer consumer2 = new MyConsumer(buffer, ThreadColor.ANSI_BLUE);

        executorService.execute(producer);
        executorService.execute(consumer1);
        executorService.execute(consumer2);

        Future<String> future = executorService.submit(new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println(ThreadColor.ANSI_RED + "I'm being printed for the callable class");
                return "This is the callable result";
            }
        });

        try {
            System.out.println(future.get());
        } catch(ExecutionException err) {
            System.out.println("Soemthing went wrong");
        } catch(InterruptedException err) {
            System.out.println("Thread running the task was interrupted");
        }

        executorService.shutdown(); // waits for executing tasks to terminate
    }
}

class MyProducer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;
//    private ReentrantLock bufferLock;

    public MyProducer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
//        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};

        for(String num : nums) {
            try {
                System.out.println(color + "Adding... " + num);
//                bufferLock.lock();
                buffer.put(num);

//                try {
//                    buffer.add(num);
//                } finally {
//                    bufferLock.unlock();
//                }

                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException err) {
                System.out.println("Producter was interupted");
            }
        }
        System.out.println(color + "Adding EOF and exiting...");
//        bufferLock.lock();
        try {
//            buffer.add("EOF");
            buffer.put("EOF");
        } catch(InterruptedException err) {
            err.printStackTrace();
        }
    }
}

class MyConsumer implements Runnable {
    private ArrayBlockingQueue<String> buffer;
    private String color;
//    private ReentrantLock bufferLock;

    public MyConsumer(ArrayBlockingQueue<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
//        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
//        int counter = 0;

        while(true) {
            synchronized (buffer) {
                //            if(bufferLock.tryLock()) {
                try {
                    if (buffer.isEmpty()) {
                        continue;
                    }

//                    System.out.println(color + "The counter = " + counter);
//                    counter = 0;

                    if (buffer.peek().equals(EOF)) {
                        System.out.println(color + "Exiting");
                        break;
                    } else {
                        System.out.println(color + "Removed " + buffer.take());
                    }
                } catch(InterruptedException err) {
//                    bufferLock.unlock();
                    err.printStackTrace();
                }
//            } else {
//                counter++;
//            }
            }
        }
    }
}