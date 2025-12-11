import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            if (!sc.hasNext()) arr[i] = "";
            else arr[i] = sc.next();
        }

        // Insertion Sort Ascending
        for (int i = 1; i < n; i++) {
            String key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].compareToIgnoreCase(key) > 0) { //ascending
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }

        // Output
        for (int i = 0; i < n; i++) {
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}