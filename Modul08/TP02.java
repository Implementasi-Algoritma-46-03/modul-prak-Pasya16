import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int hasil = 0;

        while (n != 0) {
            int digit = n % 10;
            hasil = hasil * 10 + digit;
            n /= 10;
        }

        System.out.println(hasil);
    }
}