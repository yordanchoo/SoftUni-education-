import java.util.Arrays;
import java.util.Scanner;

public class Exercise_07MaxSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();
        //2 1 1 2 3 3 2 2 2 1
        int maxLength = 0;
        int length = 1;

        int startIndex = 0;
        int bestIndex = 0;
        for (int index = 1 ; index <= numbers.length-1 ; index++) {
            if (numbers[index] == numbers[index - 1]) {
                length++;
            } else {
                length = 1;
                startIndex = index;
            }

            if (length > maxLength) {
                maxLength = length;
                bestIndex = startIndex;

            }
        }
        for (int i = bestIndex ; i < bestIndex + maxLength ; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
