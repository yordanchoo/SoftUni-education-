import java.util.Scanner;

public class Exerc02VowelsCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        findAndPrintVowelsCount(input.toLowerCase());
    }

    public static void findAndPrintVowelsCount(String word) {
        String str = new String(word);
        int charsCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' ||
                    str.charAt(i) == 'i' || str.charAt(i) == 'o' ||
                    str.charAt(i) == 'u') {
                charsCount++;
            }

        }
        System.out.println(charsCount);
    }
}
