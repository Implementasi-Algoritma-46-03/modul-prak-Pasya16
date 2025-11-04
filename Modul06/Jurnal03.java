import java.util.Scanner;//tes

public class Jurnal03 {

    // Method untuk menghitung volume maks tangki
    public static double volumeMax(double r, double h) {
        double PI = 3.14159;
        return PI * r * r * h;
    }

    // Method untuk menghitung volume air saat ini
    public static double volumeAir(double r, double t) {
        double PI = 3.14159;
        return PI * r * r * t;
    }

    // Method untuk menghitung presentase ketinggian air
    private static double persentase(double t, double h) {
        return (t / h) * 100;
    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double h = input.nextDouble();
        double t = input.nextDouble();

        double vMax = volumeMax(r, h);
        double vAir = volumeAir(r, t);
        double persentase = persentase(t, h);

        System.out.printf("%.2f %.2f %.1f%%", vMax, vAir, persentase);
        
        input.close();
    }
}