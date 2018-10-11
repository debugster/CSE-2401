/*
Uses UnsynchronizedPaint
 */

public class ThreadTypeB1 extends Thread {
    private UnsynchronizedPaint p;

    ThreadTypeB1(UnsynchronizedPaint pOb) {
        p = pOb;
    }

    public void run() {
        p.paint('#');
    }
}
