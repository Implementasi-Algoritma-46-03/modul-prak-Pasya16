import java.util.Scanner;

public class Jurnal01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNextInt()) return;//cek input int, klo ga ada berhenti.
        int n = sc.nextInt();
        sc.nextLine(); // memasukan data barang 

        String[] arr = new String[n]; // membuat array string sebanyak n
        for (int i = 0; i < n; i++) { // mulai loop utk mengisi array dri index 0 sampai n-1
            if (!sc.hasNext()) arr[i] = ""; // jika input habis, isi array dg string kosong
            else arr[i] = sc.next(); // jika ada inputan, simpan ke array
        }

        // Bagian Insertion Sort Descending
        for (int i = 1; i < n; i++) { //perulangan dimulai dari 1, selama i kurang dari n, i bertambah 1
            String key = arr[i]; // menyimpan data sementara   
            int j = i - 1; // variabel j berisi index sebelum i buat pembanding ke sebelah kiri

            while (j >= 0 && arr[j].compareToIgnoreCase(key) < 0) {  
            // perulangan bakalan berjalan selama j lebih besar sama dengan 0 dan j lebih kecil dari key
            // intinya kalo j ada setelah key maka akan di geser ke kanan biar Z-A
                arr[j + 1] = arr[j]; // geser ke kanan
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