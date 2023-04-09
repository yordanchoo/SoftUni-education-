import java.util.Scanner;

public class Lab04_TextFilter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] bannedWords = sc.nextLine().split(", ");
        String text = sc.nextLine();

        for (int i = 0; i < bannedWords.length ; i++) {
            String current = bannedWords[i];

            text = text.replace(current,repeatString("*",current.length()));
        }
        System.out.println(text);
    }
    public static String repeatString (String s, int count) {
        String result = "";
        for (int i = 0; i < count; i++) {
            result += s;
        }
        return result;
    }
}
