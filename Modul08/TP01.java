import java.util.Scanner;

public class TP01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int amoeba = 30;
        int waktu = 0;

        while (amoeba < n) {
            amoeba *= 2;
            waktu += 15;
        }

        System.out.println(waktu);
    }
}