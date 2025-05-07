import java.util.Scanner;

class Multiplication extends Thread {

    public void run() {
        System.out.println("Multiplication table of 5:");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i + " X 5 = " + (i * 5));
        }
        System.out.println("Exiting from Thread Multiplication...");
    }
}

class PrimeNumbers extends Thread {

    public void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n for Prime numbers: ");
        int n = sc.nextInt();

        System.out.println("All the Prime numbers between 1 and " + n + " are:");
        for (int x = 2; x <= n; x++) {
            int flag = 1;
            for (int y = 2; y <= x / 2; ++y) {
                if (x % y == 0) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.print(x + "\t");
            }
        }
        System.out.println();
        sc.close(); // Best practice
    }
}

public class thread {
    public static void main(String[] args) {
        Multiplication m = new Multiplication();
        m.start();

        PrimeNumbers p = new PrimeNumbers();
        p.start();
    }
}

