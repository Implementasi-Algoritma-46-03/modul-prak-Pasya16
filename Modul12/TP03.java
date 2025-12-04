import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] matriksA = new int[n][n];
        int[][] matriksB = new int[n][n];
        int[][] matriksHasil = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksA[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriksB[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int sum = 0;
                for (int k = 0; k < n; k++) {
                    sum += matriksA[i][k] * matriksB[k][j];
                }
                matriksHasil[i][j] = sum;
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matriksHasil[i][j]);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}