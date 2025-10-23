import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
       //input
        Scanner s = new Scanner(System.in);
        double r1 = s.nextDouble();
        double r2 = s.nextDouble();
        double r3 = s.nextDouble();

        // proses
        double c1 = f2c(r1);
        double c2 = f2c(r2);
        double c3 = f2c(r3);

        double re1 = f2r(r1);
        double re2 = f2r(r2);
        double re3 = f2r(r3);

        // Output
        System.out.printf("Celcius: %.1f %.1f %.1f\n", c1, c2, c3);
        System.out.printf("Reamur: %.2f %.2f %.2f\n", re1, re2, re3);
    }

    private static double f2c(double f2c) {
        return (f2c - 32) * 5 / 9;
    }
    private static double f2r(double f2r) {
        return (f2r - 32) * 4 / 9;
    }
}