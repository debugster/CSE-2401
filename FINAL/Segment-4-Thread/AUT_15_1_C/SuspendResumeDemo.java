public class SuspendResumeDemo extends Thread {
    private String threadName;

    SuspendResumeDemo(String name) {
        threadName = name;
    }

    @Override
    public void run() {
        System.out.println("Thread " + threadName + " starts.");
        for (int i = 1; i <= 10; i++) {
            System.out.println("From " + threadName + " : " + i);
        }
        System.out.println("Thread " + threadName + " ends.");
    }
}
