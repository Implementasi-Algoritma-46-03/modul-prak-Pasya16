import java.util.Scanner;

public class Jurnal03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int D = input.nextInt(); //untuk input nilai Dira
        int R = input.nextInt(); //untuk input nilai Radi
        int I = input.nextInt(); //untuk input nilai Idar
        input.close();

        //buat ngecek siapa urutan nilai dari yang terkecil ke terbesar
        if (D < R && D < I) {
            // jika Dira paling kecil
            if (R < I) {
                //maka sistem ngasih urutan pertamanya ada di Dira
                System.out.println("Dira, Radi, Idar");
            } else {
                System.out.println("Dira, Idar, Radi");
            }
            //kalau Radi lebih kecil dari Dira/Idar
        } else if (R < D && R < I) {
            // jika Radi paling kecil
            if (D < I) {
                //maka sistem ngasih urutan pertamanya ada di Radi
                System.out.println("Radi, Dira, Idar");
            } else {
                System.out.println("Radi, Idar, Dira");
            }
        } else {
            // jika Idar paling kecil
            if (D < R) {
                System.out.println("Idar, Dira, Radi");
            } else {
                System.out.println("Idar, Radi, Dira");
            }
        }
    }
}