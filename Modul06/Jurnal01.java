import java.util.Scanner;

public class Jurnal01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nama1 = s.nextLine();
        String nama2 = s.nextLine();
        int jam = s.nextInt();

        System.out.println("Halo, " + nama1 + ". Selamat " + sapaan(jam) + ".");
        System.out.println("Halo, " + nama2 + ". Selamat " + sapaan(jam) + ".");
    }
    
    private static String sapaan (int jam){
        String waktu = "";
        if (jam >= 6 && jam <= 11){
            waktu = "pagi";
        } else if (jam >= 12 && jam <= 14){
            waktu = "siang";
        }else if (jam >= 15 && jam <= 17){
            waktu = "sore";
        }else if (jam >= 18 && jam <= 05){
            waktu = "malam";
        }
        return waktu; 
    }
}mport java.util.Scanner;

public class Jurnal01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String nama1 = s.nextLine();
        String nama2 = s.nextLine();
        int jam = s.nextInt();

        System.out.println("Halo, " + nama1 + ". Selamat " + sapaan(jam) + ".");
        System.out.println("Halo, " + nama2 + ". Selamat " + sapaan(jam) + ".");
    }
    
    private static String sapaan (int jam){
        String waktu = "";
        if (jam >= 6 && jam <= 11){
            waktu = "pagi";
        } else if (jam >= 12 && jam <= 14){
            waktu = "siang";
        }else if (jam >= 15 && jam <= 17){
            waktu = "sore";
        }else if (jam >= 18 && jam <= 05){
            waktu = "malam";
        }
        return waktu; 
    }
}