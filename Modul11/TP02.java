import java.util.Scanner;
import java.util.Arrays;

public class TP02 {

    public static void main(final String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
        }
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (sc.hasNextInt()) {
                arr[i] = sc.nextInt();
            } else {
                arr[i] = 0;
            }
        }
        sc.close();

        Arrays.sort(arr); // ascending
        StringBuilder sb = new StringBuilder();
        for (int i = n - 1; i >= 0; i--) {
            sb.append(arr[i]);
            if (i > 0) sb.append(" ");
        }
        System.out.println(sb.toString());
    }
}
