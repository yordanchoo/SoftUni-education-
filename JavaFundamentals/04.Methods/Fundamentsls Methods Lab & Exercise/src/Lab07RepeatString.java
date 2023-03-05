import java.util.Scanner;

public class Lab07RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String charSequence = sc.nextLine();
        int repeatCount = Integer.parseInt(sc.nextLine());
        printCharsOfString(charSequence, repeatCount);
    }

    public static String printCharsOfString(String input, int n) {
        String result = "";
        for (int i = 0; i < n; i++) {
            System.out.print(input);
        }
        return result;
    }
}
