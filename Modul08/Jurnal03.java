import java.util.Scanner;

public class Jurnal03 {
    public static int faktorial(int n) {
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt();
        int temp = angka;
        int jumlah = 0;

        while (temp > 0) {
            int digit = temp % 10;
            jumlah += faktorial(digit);
            temp /= 10;
        }

        if (jumlah == angka) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}
