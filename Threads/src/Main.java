public class Main {
    public static void main(String[] args) {
        System.out.println(ThreadColor.ANSI_PURPLE + "Hello from the main thread");
        Thread anotherThread = new AnotherThread();
        anotherThread.setName("== Another Thread");

        anotherThread.start(); // Enables jvm to run the run method

        new Thread() {
            public void run() {
                System.out.println(ThreadColor.ANSI_GREEN + "Hello from the anonymous class thread");
            }
        }.start();

        Thread myRunnableThread = new Thread(new MyRunnable() {
            @Override
            public void run() {
                System.out.println(ThreadColor.ANSI_RED + "Hello from another anonymous class's implementation of run()");
                try {
                    anotherThread.join(); // call join on the thread you want to join another thread to
                    System.out.println(ThreadColor.ANSI_RED + "AnotherThread terminated, or timed out, so I'm running again");
                } catch(InterruptedException err) {
                    System.out.println(ThreadColor.ANSI_RED + "I couldn't wait after all.  I was interuptted");
                }
            }
        });
        myRunnableThread.start();
//        anotherThread.interrupt();

        System.out.println(ThreadColor.ANSI_PURPLE + "Hello again from the main thread");
    }
}