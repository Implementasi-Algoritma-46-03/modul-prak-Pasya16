import java.util.ArrayList;
import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> daftarAngka = new ArrayList<>();
        int angka;
        while (true) {
            angka = scanner.nextInt();
            if (angka == -1) {
                break;
            }
            daftarAngka.add(angka);
        }

        int modusTerbesar = daftarAngka.get(0);
        int frekuensiTertinggi = 0;

        for (int i = 0; i < daftarAngka.size(); i++) {
            int hitung = 0;

            for (int j = 0; j < daftarAngka.size(); j++) {
                if (daftarAngka.get(i).equals(daftarAngka.get(j))) {
                    hitung++;
                }
            }

            if (hitung > frekuensiTertinggi || 
               (hitung == frekuensiTertinggi && daftarAngka.get(i) > modusTerbesar)) {
                frekuensiTertinggi = hitung;
                modusTerbesar = daftarAngka.get(i);
            }
        }

        System.out.println(modusTerbesar);
        scanner.close();
    }
}
