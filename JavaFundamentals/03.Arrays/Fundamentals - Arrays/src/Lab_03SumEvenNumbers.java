import java.util.Arrays;
import java.util.Scanner;

public class Lab_03SumEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numArr = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int evenSum = 0;
        for (int i = 0; i < numArr.length ; i++) {
            if (numArr[i] % 2 == 0) {
                evenSum += numArr[i];
            }

        }
        System.out.println(evenSum);
    }
}
