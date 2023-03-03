import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());
        int multiplier = Integer.parseInt(scanner.nextLine());

        if (multiplier > 10) {
            int result = input * multiplier;
            System.out.printf("%d X %d = %d%n", input, multiplier, result);
        } else {
            for (int i = multiplier; i <= 10; i++) {
                int result = input * i;
                System.out.printf("%d X %d = %d%n", input, i, result);
            }

        }
    }
}
