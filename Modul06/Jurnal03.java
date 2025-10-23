import java.util.Scanner;

public class Jurnal03 {

    // Method untuk menghitung volume maks air
    public static double volumeMax(double r, double h) {
        double PI = 3.14159;
        return PI * r * r * h;
    }

    // Method untuk menghitung volume air saat ini
    public static double volumeAir(double r, double t) {
        double PI = 3.14159;
        return PI * r * r * t;
    }

    // Method untuk menghitung prosentase ketinggian air
    private static double prosentase(double t, double h) {
        return (t / h) * 100;
    }

    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);

        double r = input.nextDouble();
        double h = input.nextDouble();
        double t = input.nextDouble();

        double vMax = volumeMax(r, h);
        double vAir = volumeAir(r, t);
        double prosentase = prosentase(t, h);

        System.out.printf("%.2f %.2f %.1f%%", vMax, vAir, prosentase);
        
        input.close();
    }
}