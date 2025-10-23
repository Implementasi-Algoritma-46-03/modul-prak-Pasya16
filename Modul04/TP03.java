import java.util.Scanner;
//nddjbjd
public class TP03 {
//testingg
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nilaiDira = scanner.nextInt();
        int nilaiRadi = scanner.nextInt();
        int nilaiIdar = scanner.nextInt();

        if (nilaiDira > nilaiRadi && nilaiDira > nilaiIdar) {
            System.out.println("Dira");
        } else if (nilaiRadi > nilaiDira && nilaiRadi > nilaiIdar) {
            System.out.println("Radi");
        } else {
            System.out.println("Idar");
        }

        scanner.close();
    }
}
