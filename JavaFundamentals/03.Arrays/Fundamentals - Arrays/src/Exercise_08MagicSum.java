import java.util.Arrays;
import java.util.Scanner;

public class Exercise_08MagicSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] array = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int uniqueNum = Integer.parseInt(sc.nextLine());

        for (int i = 0; i <= array.length - 1 ; i++) {
            int currentNum = array[i];
            for (int inIndex = i + 1;  inIndex <= array.length - 1 ;  inIndex++) {
                int inNumber = array[inIndex];
                if (currentNum + inNumber == uniqueNum) {
                    System.out.println(currentNum + " " + inNumber);
                }
            }
        }
    }
}
