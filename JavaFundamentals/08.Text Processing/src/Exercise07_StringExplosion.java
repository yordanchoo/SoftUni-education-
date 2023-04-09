import java.util.Scanner;

public class Exercise07_StringExplosion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        StringBuilder text = new StringBuilder(input);
        int totalStrength = 0;
        for (int position = 0; position < text.length(); position++) {
            char current = text.charAt(position);

            if (current == '>') {
                int strength = Integer.parseInt(text.charAt(position + 1) + "");
                totalStrength += strength;
            } else if (current != '>' && totalStrength > 0) {
                text.deleteCharAt(position);
                totalStrength--;
                position--;
            }
        }
        System.out.println(text);
    }
}
