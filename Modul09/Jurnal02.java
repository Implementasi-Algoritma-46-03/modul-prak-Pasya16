import java.util.Scanner;

public class Jurnal02 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();

        int total = 0; 

        for (int i = 1; i <= N; i++) {
            if (i % 2 != 0) { 
                total += i;
            }
        }

        System.out.println(total);
    }
}