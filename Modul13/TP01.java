import java.util.*;

public class TP01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] wave1 = new double[10];
        double[] wave2 = new double[10];

        for (int i = 0; i < 10; i++) {
            wave1[i] = input.nextDouble();
        }

        for (int i = 0; i < 10; i++) {
            wave2[i] = input.nextDouble();
        }

        bubbleSortAscending(wave1);
        bubbleSortAscending(wave2);

        printArray(wave1);
        printArray(wave2);
    }

    public static void bubbleSortAscending(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%.2f", arr[i]);
            if (i < arr.length - 1) System.out.print(" ");
        }
        System.out.println();
    }
}