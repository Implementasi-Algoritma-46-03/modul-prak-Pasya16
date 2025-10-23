import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int jumlahLembar = n/1000;
        int sisaLembar = n%1000;

        System.out.println(jumlahLembar);
        System.out.println(sisaLembar);


    }
}
