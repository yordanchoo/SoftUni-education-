import java.util.Arrays;
import java.util.Scanner;

public class TribonacciSequence_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int[] printNumbersArr = printNumbers(num);
        for (int i = 0; i < num; i++) {
            System.out.print(printNumbersArr[i] + " ");
        }
    }

    private static int[] printNumbers(int n) {
        int[] numArray = new int[n];
        for (int i = 0; i < n; i++) {
            if (i == 0 || i == 1) {
                numArray[i] = 1;
            } else if (i == 2) {
                numArray[i] = 2;
            } else if (i > 1) {
                numArray[i] = numArray[i - 1] + numArray[i - 2] + numArray[i - 3];
            }
        }
        return numArray;
    }
}
