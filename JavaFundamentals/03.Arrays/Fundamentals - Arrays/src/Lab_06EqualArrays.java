import java.util.Arrays;
import java.util.Scanner;

public class Lab_06EqualArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] firstArray = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int[] secondArray = Arrays
                .stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int sum = 0;
        int diffIndex = 0;
        boolean isEqual = true;
        for (int i = 0; i < firstArray.length; i++) {
            if (firstArray[i] != secondArray[i]) {
                diffIndex = i;
                isEqual = false;
                break;
            } else {
                sum += firstArray[i];

            }
        }
        if (isEqual) {
            System.out.printf("Arrays are identical. Sum: %d", sum);
        } else {
            System.out.printf("Arrays are not identical. Found difference at %d index.", diffIndex);
        }

    }
}
//2ND SOLUTION

//    Scanner sc = new Scanner(System.in);
//    int[] firstArr = Arrays.stream(sc.nextLine().split(" "))
//            .mapToInt(Integer::parseInt)
//            .toArray();
//
//    int[] secondArr = Arrays.stream(sc.nextLine().split(" "))
//            .mapToInt(Integer::parseInt)
//            .toArray();
//    int sum = 0;
//    int diffIndex = 0;
//    boolean areIdentical = true;
//        for (int i = 0; i < firstArr.length; i++) {
//        int currentElement = firstArr[i];
//        if (currentElement == secondArr[i]) {
//        sum+=firstArr[i];
//
//        } else {
//        areIdentical = false;
//        diffIndex = i;
//        break;
//        }
//        }
//        if (areIdentical) {
//        System.out.printf("Arrays are identical. Sum: %d",sum);
//        } else {
//        System.out.printf("Arrays are not identical. Found difference at %d index.",diffIndex);
//        }
//        }
//        }
