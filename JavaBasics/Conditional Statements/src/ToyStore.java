import java.util.Scanner;

public class ToyStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double value = Double.parseDouble(scanner.nextLine());
        int puzzle = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double totalPrice = puzzle * 2.6 + dolls * 3 + bears * 4.10 + minions * 8.2 +
                trucks * 2.0;
        double totalToys = puzzle + dolls + bears + minions + trucks;

        if (totalToys >= 50) {
            totalPrice = totalPrice * 0.75;
        }
        totalPrice = totalPrice * 0.90;
        if (totalPrice >= value) {
            System.out.printf("Yes! %.2f lv left.", totalPrice - value);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.",
                    Math.abs(value - totalPrice));
        }
    }
}
