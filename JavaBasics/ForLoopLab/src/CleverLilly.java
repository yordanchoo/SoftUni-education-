import java.util.Scanner;

public class CleverLilly {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = Integer.parseInt(scanner.nextLine());
        double washingMachinePrice = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int savedMoney = 0;
        int toysCount = 0;
        for (int y = 1; y <= age; y++) {
            if (y % 2 == 0) {
                savedMoney += y * 5;
                savedMoney--;
            } else {
                toysCount++;
            }
        }
        int total = toysCount * toyPrice + savedMoney;
        if (total >= washingMachinePrice) {
            System.out.printf("Yes! %.2f", total - washingMachinePrice);
        } else {
            System.out.printf("No! %.2f", washingMachinePrice - total);
        }
    }
}
