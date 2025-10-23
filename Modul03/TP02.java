import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
         Scanner input = new Scanner(System.in);

         String nama = input.next();
         int jumlah = input.nextInt();
         int harga = input.nextInt();

         int total = harga * jumlah;

        // Output 
         System.out.println("Hai " + nama + ". Total belanja adalah " + total + " rupiah");

         input.close();
    }
}
