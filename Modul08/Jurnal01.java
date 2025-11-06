import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        double R = input.nextDouble();
        double N = input.nextDouble();

        double sisa = R * Math.pow(0.5, N/ 10.0);

        System.out.printf("%.3f\n", sisa);
    }
}
