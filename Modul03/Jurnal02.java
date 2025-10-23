import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        double rataRata = (a + b + c)/3.0;

        System.out.printf("Nilai rata-rata: %.2f", rataRata);

    }
}
