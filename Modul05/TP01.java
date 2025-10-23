import java.util.Scanner;
public class TP01 {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        String bulanIndonesia = inputScanner.nextLine().toLowerCase();
        String bulanPerancis;

        switch (bulanIndonesia) {
            case "januari":
                bulanPerancis = "janvier";
                break;
            case "februari":
                bulanPerancis = "fevrier";
                break;
            case "maret":
                bulanPerancis = "mars";
                break;
            case "april":
                bulanPerancis = "avril";
                break;
            case "mei":
                bulanPerancis = "mai";
                break;
            case "juni":
                bulanPerancis = "juin";
                break;
            case "juli":
                bulanPerancis = "juillet";
                break;
            case "agustus":
                bulanPerancis = "aout";
                break;
            case "september":
                bulanPerancis = "septembre";
                break;
            case "oktober":
                bulanPerancis = "octobre";
                break;
            case "november":
                bulanPerancis = "novembre";
                break;
            case "desember":
                bulanPerancis = "decembre";
                break;
            default:
                bulanPerancis = "Nama bulan tidak valid.";
                break;
        }

        System.out.println(bulanPerancis);

        inputScanner.close();
    }
}