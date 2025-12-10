import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // ukuran matriks

        int mulai = 0;       // batas awal yang kiri atas
        int counter = 0;     // angka yang di isi
        int akhir = N;       // batas akhir yang bawah kanan
        int loop = 0;        // lapisan ke berapa yang lagi di isi
        
        int[][] matriks = new int[N][N]; // matriks NxN

        while (akhir > 0) {
            // kiri → bawah
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[i + loop][mulai + loop] = counter;
            }

            akhir--;

            // bawah → kanan
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[akhir + loop][i + 1 + loop] = counter;
            }

            // kanan → atas
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[akhir - i - 1 + loop][akhir + loop] = counter;
            }

            akhir--;

            // atas → kiri
            for (int i = mulai; i < akhir; i++) {
                counter++;
                matriks[mulai + loop][akhir - i + loop] = counter;
            }

            loop++; // pindah ke lapisan berikutnya
        }

        // cetak hasil
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(matriks[i][j]);
                if (j < N - 1) System.out.print(" ");
            }
            System.out.println();
        }
    }
}