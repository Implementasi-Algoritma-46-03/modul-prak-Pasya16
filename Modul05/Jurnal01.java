import java.util.Scanner;
public class Jurnal01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int kodeMenu = input.nextInt();
        int jumlahMakanan = input.nextInt();
        
        //Switch berfungsi untuk memilih menu sesuai yang di kode yang di masukan user
        switch (kodeMenu) {
            case 1:
            //harga nasi goreng di kali sama jumlah
            int hargaNasiGoreng = (15 * jumlahMakanan);
            //nanti sistem bakalan menampilkan :
            System.out.println("Nasi Goreng " + jumlahMakanan + " buah, total harga Rp. " + hargaNasiGoreng + ".000" );
            //break fungsinya biar casenya ga nyampur ke bawah
                break;
                
            case 2:
            int hargaMieGoreng = 18 * jumlahMakanan;
            System.out.println("Mie Goreng / Nyemek " + jumlahMakanan + " buah, total harga Rp. " + hargaMieGoreng + ".000");
                break;

            case 3:
            int hargaKwetiauGoreng  = 20 * jumlahMakanan;
            System.out.println("Kwetiau Goreng / Nyemek " + jumlahMakanan + " buah, total harga Rp. " + hargaKwetiauGoreng + ".000");
                break;

            case 4:
            int hargaCapcayGoreng  = 23 * jumlahMakanan;
            System.out.println("Capcay Goreng / Kuah " + jumlahMakanan + " buah, total harga Rp. " + hargaCapcayGoreng  + ".000");
                break;
        }

    }
}