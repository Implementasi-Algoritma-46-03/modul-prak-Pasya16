import java.util.Scanner;

public class Jurnal02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ukuranPapan = input.nextInt(); 
        // membuat array 2D untuk papan tic tac toe
        int[][] papan = new int[ukuranPapan][ukuranPapan];
        
        // cek apa masih ada posisi kosong (nilai 0)
        boolean adaTempatKosong = false;

        // mengisi papan dari input
        for (int i = 0; i < ukuranPapan; i++) {
            for (int j = 0; j < ukuranPapan; j++) {
                papan[i][j] = input.nextInt();
                if (papan[i][j] == 0) { 
                    adaTempatKosong = true; // tandai ada tempat kosong
                }
            }
        }

        // menyimpan nilai pemenang (klo 0 artinya belum ada)
        int pemenang = 0;

        // mengecek baris dan kolom untuk menang
        for (int i = 0; i < ukuranPapan; i++) {

            //cek baris
            boolean barisSama = true; 
            int nilaiBaris = papan[i][0]; // ambil nilai pertama pada baris

            if (nilaiBaris != 0) { // kalau 0 ga bisa jadi pemenang
                for (int j = 1; j < ukuranPapan; j++) {
                    if (papan[i][j] != nilaiBaris) { // kalau ada yang beda, ga menang
                        barisSama = false;
                        break;
                    }
                }
                if (barisSama) pemenang = nilaiBaris; // simpan pemenang
            }

            //cek kolom
            boolean kolomSama = true;
            int nilaiKolom = papan[0][i]; // ambil nilai pertama pada kolom

            if (nilaiKolom != 0) {
                for (int j = 1; j < ukuranPapan; j++) {
                    if (papan[j][i] != nilaiKolom) {
                        kolomSama = false;
                        break;
                    }
                }
                if (kolomSama) pemenang = nilaiKolom;
            }
        }

        //cek diagonal utama
        boolean diagUtamaSama = true;
        int nilaiDiagUtama = papan[0][0];

        if (nilaiDiagUtama != 0) {
            for (int i = 1; i < ukuranPapan; i++) {
                if (papan[i][i] != nilaiDiagUtama) {
                    diagUtamaSama = false;
                    break;
                }
            }
            if (diagUtamaSama) pemenang = nilaiDiagUtama;
        }

        //cek diagonal samping
        boolean diagSampingSama = true;
        int nilaiDiagSamping = papan[0][ukuranPapan - 1];

        if (nilaiDiagSamping != 0) {
            for (int i = 1; i < ukuranPapan; i++) {
                if (papan[i][ukuranPapan - 1 - i] != nilaiDiagSamping) {
                    diagSampingSama = false;
                    break;
                }
            }
            if (diagSampingSama) pemenang = nilaiDiagSamping;
        }

        //output hasil
        if (pemenang == 1) {
            System.out.println("O");  // pemain O menang
        } else if (pemenang == 2) {
            System.out.println("X");  // pemain X menang
        } else if (adaTempatKosong) {
            System.out.println("?");  // belum selesai
        } else {
            System.out.println("-"); // seri (papan penuh, tidak ada pemenang)
        }
        
        input.close();
    }
}
