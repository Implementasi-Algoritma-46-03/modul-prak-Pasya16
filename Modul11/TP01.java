import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
         Scanner sc = new Scanner(System.in);
        int n = 0;
        if (sc.hasNextInt()) {
            n = sc.nextInt();
            sc.nextLine(); // consume newline
        }
        for (int i = 1; i <= n; i++) {
            String name = "";
            if (sc.hasNextLine()) {
                name = sc.nextLine();
            }
            System.out.println("Bulan " + i + ": " + name);
        }
        sc.close();
    }
}
