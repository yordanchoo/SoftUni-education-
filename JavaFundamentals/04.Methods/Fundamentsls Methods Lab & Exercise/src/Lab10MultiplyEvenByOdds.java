import java.util.Arrays;
import java.util.Scanner;

public class Lab10MultiplyEvenByOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Math.abs(Integer.parseInt(sc.nextLine()));
        System.out.println(printSumEvenAndOddSum(number));

    }

    public static int printSumEvenAndOddSum(int inputNum) {
        int evenSum = evenSum(inputNum);
        int oddSum = oddSum(inputNum);
        return evenSum * oddSum;


    }

    public static int evenSum(int number) {
        String num = Integer.toString(number);
        int[] numbersArr = Arrays.stream(num.split(""))
                .mapToInt(Integer::parseInt).toArray();

        int evenSum = 0;

        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 == 0) {
                evenSum += numbersArr[i];

            }
        }
        return evenSum;
    }

    public static int oddSum(int number) {
       String num = Integer.toString(number);
        int[] numbersArr = Arrays.stream(num.split(""))
                .mapToInt(Integer::parseInt).toArray();

        int oddSum = 0;
        for (int i = 0; i < numbersArr.length; i++) {
            if (numbersArr[i] % 2 != 0) {
                oddSum += numbersArr[i];
            }
        }
        return oddSum;
    }
}
