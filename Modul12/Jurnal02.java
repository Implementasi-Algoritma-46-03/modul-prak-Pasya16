import java.util.Scanner;

public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int[][] matriks = new int[N][N];

        // Input matriks
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                matriks[i][j] = s.nextInt();
            }
        }

        int hasil = pemenang(matriks);

        if (hasil == 1) {
            System.out.println("O");
        } 
        else if (hasil == 2) {
            System.out.println("X");
        } 
        else {
            if (seri(matriks)) {
                System.out.println("-");
            } else {
                System.out.println("?");
            }
        }
    }

    // Menentukan pemenang tic-tac-toe
    private static int pemenang(int[][] matriks) {

        // Cek baris
        for (int i = 0; i < matriks.length; i++) {
            if (matriks[i][0] == matriks[i][1] &&
                matriks[i][1] == matriks[i][2] &&
                matriks[i][0] != 0) 
            {
                return matriks[i][0];
            }
        }

        // Cek kolom
        for (int j = 0; j < matriks.length; j++) {
            if (matriks[0][j] == matriks[1][j] &&
                matriks[1][j] == matriks[2][j] &&
                matriks[0][j] != 0) 
            {
                return matriks[0][j];
            }
        }

        // Cek diagonal utama
        if (matriks[0][0] == matriks[1][1] &&
            matriks[1][1] == matriks[2][2] &&
            matriks[0][0] != 0) 
        {
            return matriks[0][0];
        }

        // Cek diagonal kedua
        if (matriks[2][0] == matriks[1][1] &&
            matriks[1][1] == matriks[0][2] &&
            matriks[2][0] != 0) 
        {
            return matriks[2][0];
        }

        return 0; // Tidak ada pemenang
    }

    // Mengecek apakah seri
    private static boolean seri(int[][] matriks) {

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks.length; j++) {
                if (matriks[i][j] == 0) {
                    return false; // Masih ada ruang kosong → belum seri
                }
            }
        }

        return true; // Tidak ada 0 → papan penuh → seri
    }
}