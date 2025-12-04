import java.util.Scanner;

public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        int[][] matriks = new int[N][N];

        for (int i=0; i <N; i++) { //baris
            for (int j=0; j<N; j++) { //kolom
                matriks[i][j] = s.nextInt(); //simpan input
            }
        }

        for (int i=N-1; i>=0; i--) {
            for (int j=0; j<N; j++) {
                System.out.print(matriks[i][j]);
                if (j < N -1)
                    System.out.print(" ");
            }
            System.out.println();     
        }
    }
}