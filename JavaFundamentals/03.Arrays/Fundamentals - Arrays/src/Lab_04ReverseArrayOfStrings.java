import java.util.Scanner;

public class Lab_04ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] symbolsArr = sc.nextLine().split(" ");

        for (int i = 0; i < symbolsArr.length / 2 ; i++) {
            String original = symbolsArr[i];
            symbolsArr[i] = symbolsArr[symbolsArr.length -1 - i];
            symbolsArr[symbolsArr.length - 1 - i] = original;
        }
        System.out.println(String.join(" ",symbolsArr));
    }
}
// 2ND OPTION

//    String[] letter = scanner.nextLine().split(" ");
//    String[] reversedLetter = new String[letter.length];
//
//        for (int i = letter.length - 1; i >= 0 ; i--) {
//                reversedLetter[i] = letter[i];
//                System.out.print(reversedLetter[i] + " ");