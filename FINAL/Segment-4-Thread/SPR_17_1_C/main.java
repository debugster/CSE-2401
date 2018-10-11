public class main {
    public static void main(String[] args) {
        DivBy3 d3 = new DivBy3();
        DivBy5 d5 = new DivBy5();

        Thread t3 = new Thread(d3);
        Thread t5 = new Thread(d5);

        t3.start();
        t5.start();
    }
}
