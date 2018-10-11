public class main extends Thread {
    public static void main(String[] args) {
        // getting reference to main thread
        Thread mainThread = Thread.currentThread();
        // main thread creates a child thread
        ChildThread childThread = new ChildThread();
        // starting child thread
        childThread.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("From Main Thread: " + i);
        }


    }
}
