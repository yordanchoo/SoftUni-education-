import java.util.Scanner;

public class Lab02_RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        for (int index = 0; index <= words.length - 1 ; index++) {
            String current = words[index];
            int wordLength = current.length();
            repeatWord(current, wordLength);
        }
    }

    private static void repeatWord(String current, int wordLength) {
        for (int w = 0; w < wordLength; w++) {
            System.out.printf("%s", current);
        }
    }
}
