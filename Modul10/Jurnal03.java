import java.util.Scanner;

public class Jurnal03 {

    public static void main(final String[] args) {
        Scanner sc= new Scanner(System.in);
        int ukuranPola = sc.nextInt();
        
        int angkaSekarang = 0;
        
        for (int baris = 1; baris <= ukuranPola; baris++) {
            int jumlahAngka = ukuranPola - baris + 1;
            
            for (int kolom = 1; kolom <= jumlahAngka; kolom++) {
                System.out.print(angkaSekarang % 10);
                angkaSekarang++;
            }
            System.out.println();
        }
        
        sc.close();
    }
}