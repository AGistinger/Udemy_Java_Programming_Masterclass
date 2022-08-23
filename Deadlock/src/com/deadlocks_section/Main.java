package com.deadlocks_section;

public class Main {
    public static Object lock1 = new Object();
    public static Object lock2 = new Object();

    public static void main(String[] args) {
        new Thread1().start();
        new Thread2().start();
    }

    private static class Thread1 extends Thread {
        @Override
        public void run() {
            synchronized (lock1) {
                System.out.println("Thread 1: has lock1");
                try {
                    Thread.sleep(100);
                } catch(InterruptedException err) {
                    err.printStackTrace();
                }
                System.out.println("Thread 1: Waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 1: has lock1 and lock2");
                }
                System.out.println("Thread 1: released lock2");
            }
            System.out.println("Thread 1: released lock2. Exiting...");
        }
    }

    private static class Thread2 extends Thread {
        @Override
        public void interrupt() {
            synchronized (lock1) {
                System.out.println("Thread 2: has lock1");
                try {
                    Thread.sleep(100);
                } catch(InterruptedException err) {
                    err.printStackTrace();
                }
                System.out.println("Thread 2: waiting for lock2");
                synchronized (lock2) {
                    System.out.println("Thread 2: has lock1 and lock2");
                }
                System.out.println("Thread 2: released lock2");
            }
            System.out.println("Thread 2: released lock1.  Exiting...");
        }
    }
}

