import java.util.Scanner;

public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        String kalimat = in.nextLine().toLowerCase();

        int vokal = 0;
        for (int i = 0; i < kalimat.length(); i++){
            char huruf = kalimat.charAt(i);
            if (huruf == 'a' || huruf == 'i' || huruf == 'u' || huruf == 'e' | huruf == 'o') {
                vokal++;
            }
        }
        System.out.println(vokal);


    }
}