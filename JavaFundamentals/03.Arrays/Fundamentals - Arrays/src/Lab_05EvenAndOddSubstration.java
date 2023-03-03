import java.util.Arrays;
import java.util.Scanner;

public class Lab_05EvenAndOddSubstration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int evenSum = 0;
        int oddSum = 0;

        for (int num : numbers ){
            if (num % 2 == 0) {
                evenSum+= num;
            }
            else {
                oddSum += num;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
