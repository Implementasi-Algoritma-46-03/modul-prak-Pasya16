import java.util.Scanner;

public class TP02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Minta user mengetik satu kalimat
        String kalimat = input.nextLine();
        input.close();

        // Hapus semua huruf vokal menggunakan method hapusVokal
        String hasil = hapusVokal(kalimat);

        // Tampilkan hasil setelah huruf vokal dihapus
        System.out.println(hasil);
    }

    // Method untuk menghapus semua huruf vokal
    private static String hapusVokal(String teks) {
        // replaceAll() akan mengganti semua huruf vokal dengan string kosong ""
        return teks.replaceAll("[AIUEOaiueo]", "");
    }
}
