public class DivBy3 implements Runnable {
    @Override
    public void run() {
        for (int i = 3; i <= 100; i += 3) {
            System.out.println(i + " is divisible by 3");
        }
    }
}
