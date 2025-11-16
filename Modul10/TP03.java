public class TP03 {

    public static void main(final String[] args) {
        for (int i = 2; i <= 100; i++){
            boolean prima = true;

            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    prima = false;
                    break;
                }
            }

            if (prima){
                System.out.print(i + " ");
            }
        }
    }
}
