import java.util.Scanner;

public class Exerc03CharactersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char firstInput = sc.nextLine().charAt(0);
        char secondInput = sc.nextLine().charAt(0);
        printCharactersInRange(firstInput,secondInput);
    }

    public static void printCharactersInRange(char firstChar, char secondChar) {
        if (firstChar < secondChar) {
            for (char symbol = (char) (firstChar + 1); symbol < (char) secondChar; symbol++) {
                System.out.print(symbol + " ");
            }
        } else {
            for (char symbol = (char)(secondChar + 1) ; symbol < (char)(firstChar); symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
