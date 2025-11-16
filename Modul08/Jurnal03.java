import java.util.Scanner;

public class Jurnal03 {
    public static int faktorial(int n) { // rumus: n! = 1 × 2 × 3 × ... × n
        int hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int angka = input.nextInt(); // input angka
        int temp = angka;
        int jumlah = 0;

        while (temp > 0) { 
            int digit = temp % 10; // ambil digit terakhir
            jumlah += faktorial(digit); // rumusnya: jumlah = jumlah + faktorial(digit)
            temp /= 10; // buat buang digit terakhir
        }

        if (jumlah == angka) { // kalau jumlah faktorial hasilin = angka nanti jadi YA
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}
