/*
Uses SynchronizedPaint
 */

public class ThreadTypeA2 extends Thread {
    private SynchronizedPaint p;

    ThreadTypeA2(SynchronizedPaint pOb) {
        p = pOb;
    }

    public void run() {
        p.paint('*');
    }
}
