import java.util.Scanner;

public class Exerc09PalindromeIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String numbers = sc.nextLine();
        while (!numbers.equals("END")) {
            if (!printPalindromeNum(numbers)) {
                System.out.println("false");
            }else {
                System.out.println("true");
            }
            numbers = sc.nextLine();
        }
    }

    private static boolean printPalindromeNum(String numbersInput) {
        String reversedString = "";
        for (int i = numbersInput.length() - 1; i >= 0; i--) {
            reversedString += numbersInput.charAt(i);
        }
        return numbersInput.equals(reversedString);
    }
}

