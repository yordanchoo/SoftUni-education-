import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise01_ValidUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split(", ");

        List<String> validNames = new ArrayList<>();

        for (int i = 0; i < names.length; i++) {
            String current = names[i];

            if (validUser(current)) {
                validNames.add(current);
            }
        }

        for (String current : validNames){
            System.out.printf("%s%n",current);
        }
    }

    private static boolean validUser(String current) {
        if (current.length() < 3 || current.length() > 16) {
            return false;
        }
        for (char c : current.toCharArray()){
            if (!Character.isLetterOrDigit(c) && c != '-' && c != '_' ) {
                return false;
            }
        }
        return true;
    }
}
