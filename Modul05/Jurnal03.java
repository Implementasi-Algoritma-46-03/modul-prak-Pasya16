import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();                // bilangan pertama
        char operator = scanner.next().charAt(0); // operator (+ - * /)
        int b = scanner.nextInt();                // bilangan kedua
        double hasil;

        switch (operator) {
            case '+':
                hasil = a + b;
                System.out.println((int) hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println((int) hasil);
                break;
            case '*':
                hasil = a * b;
                System.out.println((int) hasil);
                break;
            case '/':
                hasil = (double) a / b;
                // format hasil pembagian menjadi 7 angka di belakang koma
                System.out.printf("%.7f\n", hasil);
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
    }
}