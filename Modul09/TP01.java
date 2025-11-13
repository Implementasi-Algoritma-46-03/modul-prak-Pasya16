import java.util.Scanner;

public class TP01 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int batas;
        batas = in.nextInt();

        for (int angka = 1; angka <= batas; angka++){
            if (angka % 2 == 0){
                System.out.println(angka + " Genap");
            }else {
                System.out.println(angka + " Ganjil");
            }
        }

    }
}