import java.util.Scanner;
//babhbsa
public class TP02 {

    public static void main(final String[] args) {
        // Kerjakan soalnya di sini
        Scanner input = new Scanner(System.in);
        int transaksi = input.nextInt();

        if (transaksi > 200000){
            int diskon = transaksi * 5 / 100;
            int total =  transaksi - diskon;
            double ppn = total * 11 / 100;
            double totalBayar = total + ppn;  
            System.out.println("Transaksi = " + transaksi);
            System.out.println("Total = " + transaksi + " - " + diskon);
            System.out.println("Ppn 11% = " + ppn);
            System.out.printf("Total dibayar = %.1f", totalBayar);
        }else{
            int total = transaksi;
            double ppn = (total * 0.11);
            double totalBayar = total + ppn;
            System.out.println("Transaksi = " + transaksi);
            System.out.println("Total = " + transaksi);
            System.out.println("Ppn 11% = " + ppn);
            System.out.printf("Total dibayar = %.1f", totalBayar);
        }
        

    }
}