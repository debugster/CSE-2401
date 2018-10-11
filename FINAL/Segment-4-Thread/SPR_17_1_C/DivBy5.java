public class DivBy5 implements Runnable {
    @Override
    public void run() {
        for (int i = 5; i <= 100; i += 5) {
            System.out.println(i + " is divisible by 5");
        }
    }
}
