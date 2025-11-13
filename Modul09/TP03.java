import java.util.Scanner;
//update

public class TP03 {

    public static int faktorial(int angka){
        if (angka == 1){
            return 1;
        }else {
            return angka * faktorial(angka - 1);
        }
    }

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner in = new Scanner(System.in);
        int angka = in.nextInt();

        //tes

        int hasil = faktorial(angka);

        System.out.println();

        System.out.println(hasil);

        
        
    }
}
