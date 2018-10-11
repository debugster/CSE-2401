/*
Implementation of suspend() and resume()
NOTE: These methods are deprecated now to avoid deadlock situations
 */

public class main {
    public static void main(String[] args) {
        SuspendResumeDemo t1 = new SuspendResumeDemo("A");
        SuspendResumeDemo t2 = new SuspendResumeDemo("B");
        SuspendResumeDemo t3 = new SuspendResumeDemo("C");

        t1.start();
        t2.start();
        t2.suspend(); // suspend() is deprecated
        t3.start();
        t2.resume(); // resume() is deprecated
    }
}
