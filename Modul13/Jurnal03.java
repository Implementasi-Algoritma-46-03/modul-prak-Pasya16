import java.util.Scanner;

public class Jurnal03 {
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

        String key = ""; //kata kunci pencarian
        if (sc.hasNext()) key = sc.next(); //membaca kata kunci

        int found = -1; // tanda data tidak di temukan
        for (int i = 0; i < n; i++) { // berjalan sampai n
            if (arr[i].compareToIgnoreCase(key) == 0) { // membandingkan data dengan kata kunci
                found = i; // klo cocok simpan index
                break;
            }
        }

        if (found == -1) { // jika tidak di temukan
            System.out.println("Data tidak ditemukan");
        } else {
            System.out.println("Ditemukan di indeks ke-" + (found + 1));
        }
    }
}