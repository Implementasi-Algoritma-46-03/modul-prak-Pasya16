import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] A = new int[n][n];
        int[][] B = new int[n][n];
        int[][] hasil = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                B[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int total = 0;
                for (int k = 0; k < n; k++) {
                    total += A[i][k] * B[k][j];
                }
                hasil[i][j] = total;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(hasil[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}
