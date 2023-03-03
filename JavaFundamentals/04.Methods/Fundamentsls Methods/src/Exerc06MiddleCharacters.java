import java.util.Scanner;

public class Exerc06MiddleCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputChars = sc.nextLine();
        printMiddleChar(inputChars);

    }
    //prints the middle character. If the length of the string is even, there are two middle characters.
    private static void printMiddleChar (String input) {
        if (input.length() % 2 == 1) {
            System.out.println(input.charAt(input.length() / 2 ));
        } else {
            int firstChar = input.length() / 2 - 1;
            int secondChar = input.length() / 2;
            System.out.print(input.charAt(firstChar) + "" + input.charAt(secondChar));
        }
    }
}
