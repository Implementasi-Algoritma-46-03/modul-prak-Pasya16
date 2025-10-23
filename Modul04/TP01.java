import java.util.Scanner;
//testinggggggsss
public class TP01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka = scanner.nextInt();

        if (angka % 6 == 0) {
            System.out.println("Kelipatan enam");
        } else {
            System.out.println("Bukan kelipatan enam");
        }

        scanner.close();
    }
}
