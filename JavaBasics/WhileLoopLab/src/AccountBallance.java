import java.util.Scanner;

public class AccountBallance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int transactions = Integer.parseInt(scanner.nextLine());
        double ballance = 0;
        double transMade = 0;
        while (transMade < transactions) {
            double amount = Double.parseDouble(scanner.nextLine());
            if (amount < 0) {
                System.out.println("Invalid operation!");
                break;
            } else {
                System.out.printf("Increase: %.2f%n", amount);
            }
            ballance +=amount;
            transMade++;
        }

        System.out.printf("Total: %.2f", ballance);
    }

}
