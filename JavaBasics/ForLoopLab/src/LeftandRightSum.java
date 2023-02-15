import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 1; i <= 2 * n; i++) {
            int num = Integer.parseInt(scanner.nextLine());
            if (i <= n) {
                leftSum += num;
            } else {
                rightSum += num;
            }
        }
        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", leftSum);
        } else {
            int diff = leftSum-rightSum  ;
            System.out.printf("No, diff = %d",Math.abs(diff));

        }
    }
}
