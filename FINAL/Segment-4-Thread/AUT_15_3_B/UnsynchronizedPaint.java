public class UnsynchronizedPaint {
    void paint(char ch) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
