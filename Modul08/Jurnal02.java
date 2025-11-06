import java.util.Scanner;
public class Jurnal02 {

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        int jumlah = 0;
        int hitung = 0;

        while (true){
            int n = input.nextInt();
            if (n == 0) break;
            jumlah += n;
            hitung++;
        }

        double rata = (double) jumlah / hitung;
        System.out.printf("%.2f\n", rata);
    }
}
