import java.util.Scanner;
public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();
        int y = input.nextInt();
        int z = input.nextInt();

        int total = x + (y * z);

        // Output 
        System.out.println(total);

        input.close();
    }
}
