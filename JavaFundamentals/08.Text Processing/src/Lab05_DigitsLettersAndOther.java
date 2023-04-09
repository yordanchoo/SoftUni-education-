import java.util.Scanner;

public class Lab05_DigitsLettersAndOther {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //"Agd#53Dfg^&4F53" - > PRINT -> first line: all digits, second line: all letters, third line: all chars

        String input = sc.nextLine();

        StringBuilder digitsStr = new StringBuilder();
        StringBuilder lettersStr = new StringBuilder();
        StringBuilder charsStr = new StringBuilder();

        for (int i = 0; i < input.length() ; i++) {
            char current = input.charAt(i);

            if (Character.isDigit(current)) {
                digitsStr.append(current);
            } else if (Character.isLetter(current)) {
                lettersStr.append(current);
            } else {
                charsStr.append(current);
            }
        }

        System.out.printf("%s%n%s%n%s",digitsStr,lettersStr,charsStr);
    }
}
