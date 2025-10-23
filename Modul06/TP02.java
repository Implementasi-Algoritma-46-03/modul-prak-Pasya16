import java.util.Scanner;
public class TP02 {

    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        String kalimat = s.nextLine();
        String noVokal = tanpaVokal(kalimat);

        System.out.println(noVokal);

    }

    private static String tanpaVokal(String kalimat){
        return kalimat.replaceAll("[aiueoAIUEO]", "");
        
    }
}
