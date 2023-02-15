import java.util.Scanner;

public class WarOfNames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int winner = Integer.MIN_VALUE;
        String firstPlace = "";

        String name = scanner.nextLine();
        while (!"Stop".equalsIgnoreCase(name)) {
            int winnerValue = 0;
            for (int i = 0; i < name.length() ; i++) {
                winnerValue += name.charAt(i);
            }
            if (winnerValue > winner) {
                winner = winnerValue;
                firstPlace = name;
            }
            name = scanner.nextLine();
        }
        System.out.printf("Winner is %s - %d",firstPlace,winner);
    }
}
