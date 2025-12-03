import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j <n; j++){
                matrix[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < n; i++){
            for (int j = n - 1; j >= 0; j--){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
            }

        input.close();
    }
}
