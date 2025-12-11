import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;//mengecek input int, klo ga ada berhenti.
        int n = sc.nextInt(); // jumlah data yg dimasukan user
        sc.nextLine(); // memasukan data barang 

        String[] arr = new String[n]; // membuat array string sebanyak n
        for (int i = 0; i < n; i++) { // mulai loop utk mengisi array dri index 0 sampai n-1
            if (!sc.hasNext()) arr[i] = ""; // jika input habis, isi array dg string kosong
            else arr[i] = sc.next(); // jika ada inputan, simpan ke array
        }

        // Bagian Insertion Sort Descending
        for (int i = 1; i < n; i++) { //mulai dari index 1 sampai akhir
            String key = arr[i]; // menyimpan data sementara
            int j = i - 1; // indeks yg akan di bandingkan 

            while (j >= 0 && arr[j].compareToIgnoreCase(key) < 0) {  // membanding kan data yg di input berdasarkan urutan abjad z - a dri tanda <
                arr[j + 1] = arr[j]; // kekanan jika data sebelumnya kecil
                j--; //pindah ke kiri
            }
            arr[j + 1] = key; // untuk memasukan data sementara ke posisi yg benar
        }

        // Output
        for (int i = 0; i < n; i++) { // menampilkan data yg telah di urutkan dari indeks ke 0 sampai n-1 yaitu indeks ke 6
            if (i > 0) System.out.print(" ");
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}