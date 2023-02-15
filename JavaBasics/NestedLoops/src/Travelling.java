import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String city = scanner.nextLine();
            if ("End".equals(city)) {
                break;

            }
            double amount = Double.parseDouble(scanner.nextLine());
            double budget = 0;
            while (amount > budget) {
                double money = Double.parseDouble(scanner.nextLine());
                budget += money;
                money++;
            }
            System.out.printf("Going to %s!\n", city);
        }

    }
}
