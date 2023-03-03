import java.util.Arrays;
import java.util.Scanner;

public class Exercise_05TopInteger {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        for (int i = 0; i <= numbers.length - 1; i++) {
            int currentNum = numbers[i];
            if (i == numbers.length - 1) {
                System.out.println(currentNum);
                break;
            }
            boolean isTop = false;
            for (int row = i + 1; row <= numbers.length - 1; row++) {
                int nextNumber = numbers[row];
                if (currentNum > nextNumber) {
                    isTop = true;
                } else {
                    isTop = false;
                    break;
                }
            }
            if (isTop) {
                System.out.print(currentNum + " ");
            }
        }
    }
}
