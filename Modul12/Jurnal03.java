import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int mulai = 0;
        int counter = 0;
        int akhir = N;
        int loop = 0;
        
        int[][] matriks = new int[N][N]; // membuat aray 2 dimensi ukuran kolom dan baris

        while (akhir > 0) {
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[i + loop][mulai+loop] = counter; // kolom paling kiri ke bawah
            }
            akhir--;
            for (int i= mulai; i<akhir; i++) {
                counter++;
                matriks[akhir + loop][i+ 1+ loop] = counter; // paling bawah kiri ke kanan
            }
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[akhir - i - 1 + loop][akhir + loop] = counter; // kolom kanan dari bawah ke atas
            }
            akhir--;
            for (int i = mulai; i<akhir; i++) {
                counter++;
                matriks[mulai+loop][akhir - i + loop] = counter; //bari atas dari kanan ke kiri
            }
            loop++;
        }        
        for (int i=0; i<N; i++) {
            for (int j=0; j<N; j++) {
                System.out.print(matriks[i][j]);
                if (j < N - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}