import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); 
        input.close();

        double persenPajak; // untuk menyimpan persentase pajak

        //Menentukan besaran pajak berdasarkan penghasilan, kalau pajak kurang atau sama dari 50 maka 
        //pajak diskonnya 5%
        if (N <= 50) {
            persenPajak = 0.05;
        //kalau kurang atau sama dari 250
        //pajak diskonnya 15%
        } else if (N <= 250) {
            persenPajak = 0.15;
        //kalau kurang atau sama dari 500
        //pajak diskonnya 25%
        } else if (N <= 500) {
            persenPajak = 0.25;
        //kalau lebih dari 500
        //pajak diskonnya 30%
        } else {
            persenPajak = 0.30;
        }

        //Hitung pajak (dalam rupiah)
        double besarPajak = N * 1_000_000 * persenPajak;
        double penghasilanBersih = N * 1_000_000 - besarPajak;

        //Cetak hasil, teks penghasilan kotor + penghasilan + juta Rupiah
        System.out.println("Penghasilan kotor = " + N + " juta Rupiah");
        //Cetak hasil, teks pajak + persen pajak + hasil dari pajak
        System.out.println("Pajak " + (int)(persenPajak * 100) + "% = Rp. " + (int)besarPajak);
        //Cetak hasil, teks penghasilan bersih Rp + hasil penghasilan.
        System.out.println("Penghasilan bersih = Rp. " + (int)penghasilanBersih);
    }
}