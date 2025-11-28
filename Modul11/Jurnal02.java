import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String kalimat = scanner.nextLine();

        String hasil = kalimat.trim().replaceAll("\\s+", " ");

        System.out.println(hasil);

        scanner.close();
    }
}