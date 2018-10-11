public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread starts.");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        System.out.println("Thread ends.");
    }
}
