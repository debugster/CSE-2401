/*
Setting priority to threads
Thread A runs after B and C ends because B and C have higher priority than A
 */

public class main {
    public static void main(String[] args) {
        PriorityDemo t1 = new PriorityDemo("A");
        PriorityDemo t2 = new PriorityDemo("B");
        PriorityDemo t3 = new PriorityDemo("C");

        t1.start();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.start();
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.start();
        t3.setPriority(Thread.NORM_PRIORITY);
    }
}
