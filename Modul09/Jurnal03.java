import java.util.Scanner;

public class Jurnal03 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); 
        boolean prima = true;    

        if (N <= 1) {
            prima = false;
        } else {
            
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) { 
                    prima = false;
                    break; 
                }
            }
        }

        if (prima) {
            System.out.println("YA");
        } else {
            System.out.println("BUKAN");
        }
    }
}