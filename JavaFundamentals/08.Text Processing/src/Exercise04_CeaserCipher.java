import java.util.Scanner;

public class Exercise04_CeaserCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        StringBuilder encrypted = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char current = (char) (text.charAt(i) + 3);
            encrypted.append(current);
        }
        System.out.println(encrypted.toString());
    }
}
