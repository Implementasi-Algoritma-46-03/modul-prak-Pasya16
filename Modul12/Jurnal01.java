import java.util.Scanner;

public class Jurnal01 {
    public static void main(final String[] args) {
        
        Scanner s = new Scanner(System.in);

        int N = s.nextInt(); //baca ukuran matriks

        //membuat array 2 dimensi utk nyimpan matriks
        int[][] matriks = new int[N][N];

        // mengisi matriks dari input
        for (int i = 0; i < N; i++) {          // loop baris
            for (int j = 0; j < N; j++) {      // loop kolom
                matriks[i][j] = s.nextInt();   // simpan angka ke dalam matriks
            }
        }

        // cetak matriks dari baris terakhir ke baris pertama (kebalik)
        for (int i = N - 1; i >= 0; i--) {     // mulai dari baris paling bawah
            for (int j = 0; j < N; j++) {      // kolom dari kiri ke kanan
                System.out.print(matriks[i][j]);  // cetak angkanya

                // beri spasi antar angka, kecuali kolom terakhir
                if (j < N - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
