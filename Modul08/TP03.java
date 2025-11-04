import java.util.Scanner;

public class TP03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int n;

        do {
            n = sc.nextInt();
            total += n;
        } while (n != 0);

        total -= 0; // biar 0 gak ikut ditambah
        System.out.println(total);
    }
}