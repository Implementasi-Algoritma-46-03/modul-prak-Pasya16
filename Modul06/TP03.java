import java.util.Scanner;
public class TP03 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String bangunDatar = s.nextLine();
        double luas = 0.0;
        double keliling = 0.0;

        switch (bangunDatar) {
            case "Persegi" :
                double sisi = s.nextDouble();
                luas = lP(sisi);
                keliling = kP(sisi);
                break;

            case "Persegi Panjang" :
                double panjang = s.nextDouble();
                double lebar = s.nextDouble();
                luas = lPP(panjang, lebar);
                keliling = kPP(panjang, lebar);
                break;

            case "Segitiga" :
                double alas = s.nextDouble();
                double tinggi = s.nextDouble();
                luas = lS(alas, tinggi);
                keliling = kS(alas, tinggi);
                break;
                
            case "Lingkaran" :
                double diameter = s.nextDouble();
                double r = diameter / 2;
                double pi = 3.14;
                luas = lL(pi, r);
                keliling = kL(pi, r);

        }
        if (bangunDatar.equals("Lingkaran")) {
            System.out.printf("%.2f %.2f", luas, keliling);
        } else {
            System.out.printf("%.0f %.0f", luas, keliling);
        }
    }

    private static double lP(double sisi) {
        return sisi * sisi;
    }

    private static double kP(double sisi) {
        return 4 * sisi;
    }

    private static double lPP(double panjang, double lebar) {
        return panjang * lebar;
    }

    private static double kPP(double panjang, double lebar) {
        return 2 * (panjang + lebar); 
    }

    private static double lS(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    private static double kS(double alas, double tinggi) {
        double sisiMiring = Math.sqrt(Math.pow(alas / 2, 2) + Math.pow(tinggi, 2));
        return alas + 2 * sisiMiring;
    }

    private static double lL(double pi, double r){
        return pi * r * r;
    }
    private static double kL(double pi, double r){
        return 2 * pi * r;
    }
}