import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int t = input.nextInt();

        int totalOrang = t + 1;

        int jatah = n / totalOrang;
        int sisa = n % totalOrang;

        // Output       
        System.out.println(jatah);
        System.out.println(sisa);

        input.close();
    }
}
