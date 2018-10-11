import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        int choice;
        Scanner input = new Scanner(System.in);

        UnsynchronizedPaint p1 = new UnsynchronizedPaint();
        SynchronizedPaint p2 = new SynchronizedPaint();

        ThreadTypeA1 a1 = new ThreadTypeA1(p1);
        ThreadTypeA2 a2 = new ThreadTypeA2(p2);
        ThreadTypeB1 b1 = new ThreadTypeB1(p1);
        ThreadTypeB2 b2 = new ThreadTypeB2(p2);

        System.out.println("Enter Your Choice:");
        System.out.println("1 - Unsynchronized");
        System.out.println("2 - Synchronized");
        choice = input.nextInt();

        switch (choice) {
            case 1:
                a1.start();
                b1.start();
                break;

            case 2:
                a2.start();
                b2.start();
                break;

            default:
                break;
        }
    }
}
