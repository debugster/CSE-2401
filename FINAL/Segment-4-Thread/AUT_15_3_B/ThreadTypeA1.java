/*
Uses UnsynchronizedPaint
 */

public class ThreadTypeA1 extends Thread {
    private UnsynchronizedPaint p;

    ThreadTypeA1(UnsynchronizedPaint pOb) {
        p = pOb;
    }

    public void run() {
        p.paint('*');
    }
}
