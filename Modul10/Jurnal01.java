public class Jurnal01 {
    public static void main(String[] args) {
        //untuk bagian baris, berapa angka yang di tampilin
        for (int i = 1; i <= 6; i++) {

            //untuk mencari barisan genap
            if (i % 2 == 0) {
                System.out.print(" "); 
            }

            //untuk bagian jumlah angka tiap baris
            for (int j = 1; j <= 5; j++) {
                System.out.print(i + " ");  
            }

            System.out.println(); 
        }
    }
}