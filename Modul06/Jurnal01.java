import java.util.Scanner;

public class Jurnal01 {

    // Method untuk menentukan sapaan berdasarkan jam
    public static String sapaan(int jam) {
        if (jam >= 6 && jam <= 11) {
            return "pagi";
        } else if (jam >= 12 && jam <= 14) {
            return "siang";
        } else if (jam >= 15 && jam <= 17) {
            return "sore";
        } else {
            return "malam";
        }
    }

    // Method utama    
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        String nama1 = input.nextLine();
        String nama2 = input.nextLine();
        int jam = input.nextInt();
        String hasilJam = sapaan(jam);

        System.out.println("Halo, " + nama1 + ". Selamat " + hasilJam + ".");
        System.out.println("Halo, " + nama2 + ". Selamat " + hasilJam + ".");

        input.close();
   }
}