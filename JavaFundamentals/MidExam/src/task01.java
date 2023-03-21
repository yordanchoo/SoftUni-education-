

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String commandLine = sc.nextLine();
        double sumBeforeDiscount = 0.0;
        while (!commandLine.equals("special") && !commandLine.equals("regular")) {
            double priceBeforeTax = Double.parseDouble(commandLine);

            if (priceBeforeTax < 0) {
                System.out.println("Invalid price!");
                commandLine = sc.nextLine();
                continue;
            }
            sumBeforeDiscount += priceBeforeTax;


            commandLine = sc.nextLine();
        }

        if (sumBeforeDiscount == 0 ) {
            System.out.println("Invalid order!");
        } else {
            System.out.printf("Congratulations you've just bought a new computer!%n");
            System.out.printf("Price without taxes: %.2f$%n",sumBeforeDiscount);
            double tax = sumBeforeDiscount * 0.20;
            System.out.printf("Taxes: %.2f$%n",tax);
            System.out.println("-----------");
            double totalSum = sumBeforeDiscount + tax;
            if (commandLine.equals("special")) {
                totalSum *= 0.90;
            }
            System.out.printf("Total price: %.2f$",totalSum);
        }

    }
}
