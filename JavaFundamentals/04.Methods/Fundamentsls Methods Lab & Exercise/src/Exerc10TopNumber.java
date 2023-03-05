import java.util.Scanner;

public class Exerc10TopNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= num; i++) {
            if (isDivisibleBy8(i) && checkForOddDigits(i)) {
                System.out.println(i);
            }
        }

    }
    private static boolean isDivisibleBy8 (int number) {
        int sumDigits = 0;
        while (number > 0) {
            int lastNumber = number % 10;
            sumDigits += lastNumber;
            number = number/10;
        }
        return sumDigits % 8 == 0;
    }
    private static boolean checkForOddDigits (int num) {
        while (num > 0 ) {
            int lastDigit = num % 10;
            if (lastDigit % 2 != 0) {
                return true;
            } else {
                num = num / 10;
            }
        }
        return false;
    }
}
