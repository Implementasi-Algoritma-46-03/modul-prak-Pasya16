import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] a = new double[10];
        double[] b = new double[10];

        // Input baris 1
        for (int i = 0; i < 10; i++) {
            a[i] = input.nextDouble();
        }

        // Input baris 2
        for (int i = 0; i < 10; i++) {
            b[i] = input.nextDouble();
        }

        bubbleAsc(a);
        bubbleAsc(b);

        print(a);
        print(b);
    }

    static void bubbleAsc(double[] x) {
        for (int i = 0; i < x.length - 1; i++) {
            for (int j = 0; j < x.length - i - 1; j++) {
                if (x[j] > x[j + 1]) {
                    double temp = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = temp;
                }
            }
        }
    }

    static void print(double[] x) {
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
            if (i < x.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}
