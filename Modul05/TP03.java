import java.util.Scanner;
import java.lang.Math;
public class TP03 {

    public static void main(String[] args) {
        final double PI = 3.14;

        Scanner inputScanner = new Scanner(System.in);

        String namaBangun = inputScanner.nextLine();

        switch (namaBangun) {
            case "Persegi": {
                int sisi = inputScanner.nextInt();
                int luas = sisi * sisi;
                int keliling = 4 * sisi;
                System.out.println(luas + " " + keliling);
                break;
            }
            case "Persegi Panjang": {
                int panjang = inputScanner.nextInt();
                int lebar = inputScanner.nextInt();
                int luas = panjang * lebar;
                int keliling = 2 * (panjang + lebar);
                System.out.println(luas + " " + keliling);
                break;
            }
            case "Segitiga": {
                double alas = inputScanner.nextDouble();
                double tinggi = inputScanner.nextDouble();
                double luas = 0.5 * alas * tinggi;
                
                double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
                double keliling = alas + tinggi + sisiMiring;

                if (luas == (long) luas && keliling == (long) keliling) {
                    System.out.println((long)luas + " " + (long)keliling);
                } else {
                    System.out.printf("%.2f %.2f\n", luas, keliling);
                }
                break;
            }
            case "Lingkaran": {
                double diameter = inputScanner.nextDouble();
                double radius = diameter / 2.0;
                double luas = PI * radius * radius;
                double keliling = PI * diameter;
                System.out.printf("%.2f %.2f\n", luas, keliling);
                break;
            }
            default:
                System.out.println("Nama bangun datar tidak valid.");
                break;
        }
        
        inputScanner.close();
    }
}