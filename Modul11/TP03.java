import java.util.Scanner;

public class TP03 {

    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = "";
        if (sc.hasNextLine()) {
            line = sc.nextLine();
        }
        sc.close();

        line = line.trim();
        if (line.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] words = line.split("\\s+");
        System.out.println(words.length);
    }
