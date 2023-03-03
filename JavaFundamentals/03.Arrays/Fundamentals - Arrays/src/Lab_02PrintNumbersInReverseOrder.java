import java.util.Scanner;

public class Lab_02PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        int[] numArr = new int[n];

        for (int i = 0; i < numArr.length; i++) {
            int number = Integer.parseInt(sc.nextLine());
            numArr[i] = number;
        }
        for (int r = numArr.length-1; r >= 0 ; r--) {
            System.out.print(numArr[r] + " ");
        }
    }
}
