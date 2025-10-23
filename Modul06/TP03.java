import java.util.Scanner; 

public class TP03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        // User memasukkan nama bangun datar
        String nama = input.nextLine();

        // Gunakan switch untuk menentukan bangun datar apa yang dihitung
        switch (nama.toLowerCase()) { // .toLowerCase agar input tidak peka huruf besar/kecil
            case "persegi":
                int sisi = input.nextInt(); // Input satu nilai sisi
                // Hitung luas dan keliling persegi
                tampilkanHasil(hitungLuasPersegi(sisi), hitungKelilingPersegi(sisi));
                break;

            case "persegi panjang":
                int panjang = input.nextInt();
                int lebar = input.nextInt(); 
                // Hitung luas dan keliling persegi panjang
                tampilkanHasil(hitungLuasPersegiPanjang(panjang, lebar), hitungKelilingPersegiPanjang(panjang, lebar));
                break;

            case "segitiga":
                int alas = input.nextInt();   
                int tinggi = input.nextInt(); 
                // Hitung luas dan keliling segitiga
                tampilkanHasil(hitungLuasSegitiga(alas, tinggi), hitungKelilingSegitiga(alas, tinggi));
                break;

            case "lingkaran":
                int diameter = input.nextInt(); 
                // Hitung luas dan keliling lingkaran
                tampilkanHasil(hitungLuasLingkaran(diameter), hitungKelilingLingkaran(diameter));
                break;

            default:
                // Jika input tidak cocok dengan pilihan di atas
                System.out.println("Bangun datar tidak dikenal");
        }

        input.close();
    }

    // Method untuk menampilkan hasil luas dan keliling
    private static void tampilkanHasil(double luas, double keliling) {
        // Tampilkan dua angka di belakang koma
        System.out.printf("%.2f %.2f\n", luas, keliling);
    }


    private static double hitungLuasPersegi(int sisi) {
        return sisi * sisi; // Rumus luas persegi = sisi × sisi
    }

    private static double hitungKelilingPersegi(int sisi) {
        return 4 * sisi; // Rumus keliling persegi = 4 × sisi
    }

    private static double hitungLuasPersegiPanjang(int p, int l) {
        return p * l; // Rumus luas persegi panjang = panjang × lebar
    }

    private static double hitungKelilingPersegiPanjang(int p, int l) {
        return 2 * (p + l); // Rumus keliling persegi panjang = 2 × (p + l)
    }

    private static double hitungLuasSegitiga(int alas, int tinggi) {
        return 0.5 * alas * tinggi; // Rumus luas segitiga = ½ × alas × tinggi
    }

    private static double hitungKelilingSegitiga(int alas, int tinggi) {
        // Keliling segitiga siku-siku = alas + tinggi + sisi miring
        double miring = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2)); // Rumus Pythagoras
        return alas + tinggi + miring;
    }

    private static double hitungLuasLingkaran(int diameter) {
        double r = diameter / 2.0; // Rumus jari-jari = diameter / 2
        return 3.14 * r * r; // Luas lingkaran = π × r² (π = 3.14 sesuai soal)
    }

    private static double hitungKelilingLingkaran(int diameter) {
        return 3.14 * diameter; // Keliling lingkaran = π × diameter
    }
}
