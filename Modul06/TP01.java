import java.util.Scanner; 

public class TP01 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        // Buat user memasukkan 3 suhu dalam Fahrenheit
        double r1 = input.nextDouble(); 
        double r2 = input.nextDouble(); 
        double r3 = input.nextDouble(); 
        input.close(); 

        // Mengonversi tiap suhu ke Celcius pakai method konversiCelcius
        double c1 = konversiCelcius(r1);
        double c2 = konversiCelcius(r2);
        double c3 = konversiCelcius(r3);

        // Mengonversi tiap suhu ke Reamur pakai method konversiReamur
        double rC1 = konversiReamur(r1);
        double rC2 = konversiReamur(r2);
        double rC3 = konversiReamur(r3);

        // Menampilkan hasil dalam format dua angka di belakang koma
        System.out.printf("%.2f %.2f %.2f\n", c1, c2, c3); // Cetak hasil Celcius
        System.out.printf("%.2f %.2f %.2f\n", rC1, rC2, rC3); // Cetak hasil Reamur
    }

    // Method untuk mengubah Fahrenheit ke Celcius
    private static double konversiCelcius(double f) {
        return (f - 32) * 5 / 9; // Rumus konversi Fahrenheit ke Celcius
    }

    // Method untuk mengubah Fahrenheit ke Reamur
    private static double konversiReamur(double f) {
        return (f - 32) * 4 / 9; // Rumus konversi Fahrenheit ke Reamur
    }
}
