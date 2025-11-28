import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> daftarPeserta = new ArrayList<>();
        String namaPeserta;
        while (true) {
            namaPeserta = scanner.nextLine();

            if (namaPeserta.equals("-")) {
                break;
            }

            daftarPeserta.add(namaPeserta);
        }

        for (int i = 0; i < daftarPeserta.size(); i++) {

            System.out.println("Bulan " + (i + 1) + ": " + daftarPeserta.get(i));
        }
        scanner.close();
    }
}