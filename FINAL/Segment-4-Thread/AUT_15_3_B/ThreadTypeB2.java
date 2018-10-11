/*
Uses SynchronizedPaint
 */

public class ThreadTypeB2 extends Thread {
    private SynchronizedPaint p;

    ThreadTypeB2(SynchronizedPaint pOb) {
        p = pOb;
    }

    public void run() {
        p.paint('#');
    }
}
