import java.util.Scanner;
public class Jurnal01 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        //24 & 56 itu angka soalnya, terus sistem input n dari user dan mengecek apakah angka tersebut
        //faktor dari 24/56, kalau hasilnya 0 berarti itu faktor.
        if (24 % n == 0 && 56 % n == 0) {
            System.out.println("Faktor dari 24 dan 56");
        } else {
            System.out.println("Bukan faktor dari 24 dan 56");
        }
    }
}