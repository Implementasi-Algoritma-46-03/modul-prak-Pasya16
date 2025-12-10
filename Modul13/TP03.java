import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);

        int jumlahMahasiswa = input.nextInt();
        int[] nilai = new int[jumlahMahasiswa];

        for (int i = 0; i < jumlahMahasiswa; i++) {
            nilai[i] = input.nextInt();
        }

        int key = input.nextInt();

        int index = linearSearch(nilai, key);

        if (index != -1) {
            System.out.println("Ditemukan di indeks ke-" + index);
        } else {
            System.out.println("Tidak ditemukan");
        }
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;          
    }
}