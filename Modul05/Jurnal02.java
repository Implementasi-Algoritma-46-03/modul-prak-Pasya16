import java.util.Scanner;

public class Jurnal02 {
    public static void main(final String[] args) {
        Scanner input = new Scanner(System.in);
        
        String hari = input.nextLine();
        int berapaHari = input.nextInt();

        int indexHariSekarang = 0;
        switch (hari) {
            case "Senin":
                indexHariSekarang = 0;
                break;
            case "Selasa":
                indexHariSekarang = 1;
                break;
            case "Rabu":
                indexHariSekarang = 2;
                break;
            case "Kamis":
                indexHariSekarang = 3;
                break;
            case "Jum'at":
                indexHariSekarang = 4;
                break;
            case "Sabtu":
                indexHariSekarang = 5;
                break;
            case "Minggu":
                indexHariSekarang = 6;
                break;
        }

        int indexHariSetelahN = (indexHariSekarang + berapaHari) % 7;

        switch (indexHariSetelahN) {
            case 0: System.out.println("Senin");
                break;
            case 1: System.out.println("Selasa");
                break;
            case 2: System.out.println("Rabu");
                break;
            case 3: System.out.println("Kamis");
                break;
            case 4: System.out.println("Jum'at");
                break;
            case 5: System.out.println("Sabtu");
                break;
            case 6: System.out.println("Minggu");
                break;
        }
    }
}