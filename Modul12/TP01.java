import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int total = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int nilai = input.nextInt();
                total += nilai;
            }
        }

        System.out.println(total);
    }
}