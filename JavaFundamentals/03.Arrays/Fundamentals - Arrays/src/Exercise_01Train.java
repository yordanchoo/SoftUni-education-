import java.util.Scanner;

public class Exercise_01Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       int n = Integer.parseInt(sc.nextLine());
       int[] numbers = new int[n];
       int sum = 0;
        for (int i = 1; i <= n ; i++) {
            int currentNum = Integer.parseInt(sc.nextLine());
            numbers[i - 1] += currentNum;

        }
        for (int people : numbers) {
            System.out.print(people + " ");
            sum += people;
        }
        System.out.println();
        System.out.print(sum);
    }
}
