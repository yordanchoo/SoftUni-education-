import java.util.Scanner;

public class exLogin_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String user = scanner.nextLine();
        String password = "";

        for (int i = user.length() - 1; i >= 0; i--) {
            char currentSymbol = user.charAt(i);
            password += currentSymbol;
        }

        String enteredPass = scanner.nextLine();
        int loginCount = 0;

        while (!enteredPass.equals(password)) {
            loginCount++;
            if (loginCount == 4) {
                System.out.printf("User %s blocked!", user);
                break;
            }
            System.out.println("Incorrect password. Try again.");
            enteredPass = scanner.nextLine();
        }
        if (enteredPass.equals(password)) {
            System.out.printf("User %s logged in.", user);
        }


    }
}
