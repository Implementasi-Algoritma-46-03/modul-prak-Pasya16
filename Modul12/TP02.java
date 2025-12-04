import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        int[][] matriksA = new int[n][n];
        int[][] matriksB = new int[n][n];

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
                int hasil = matriksA[i][j] + matriksB[i][j];
                System.out.print(hasil);
                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}