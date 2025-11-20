import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);

        int masukan = in.nextInt();

        for (int i = 1; i <= masukan ; i++){
            for (int j = 1; j < i; j++){
                System.out.print(" ");
                }
                System.out.println(i);  
        }
        
        for (int i = masukan - 1; i < masukan; i--){
            for (int s = 1; s < i; s++){
                    System.out.print(" ");
            }
            if (i == 0){
                break;
            }
            System.out.println(i);
        }


    }
}