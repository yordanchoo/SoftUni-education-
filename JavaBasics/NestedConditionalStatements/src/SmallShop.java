import java.util.Scanner;

public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        //SOFIA
        if (city.equalsIgnoreCase("sofia")) {
            if ("coffee".equalsIgnoreCase(product)) {
                price = 0.50;
            } else if ("water".equalsIgnoreCase(product)) {
                price = 0.80;
            } else if ("beer".equalsIgnoreCase(product)) {
                price = 1.20;
            } else if ("sweets".equalsIgnoreCase(product)) {
                price = 1.45;
            } else if ("peanuts".equalsIgnoreCase(product)) {
                price = 1.60;
            }

            //PLOVDIV
        } else if (city.equalsIgnoreCase("plovdiv")) {
            if ("coffee".equalsIgnoreCase(product)) {
                price = 0.40;
            } else if ("water".equalsIgnoreCase(product)) {
                price = 0.70;
            } else if ("beer".equalsIgnoreCase(product)) {
                price = 1.15;
            } else if ("sweets".equalsIgnoreCase(product)) {
                price = 1.30;
            } else if ("peanuts".equalsIgnoreCase(product)) {
                price = 1.50;
            }

            //VARNA
        } else if (city.equalsIgnoreCase("varna")) {
            if ("coffee".equalsIgnoreCase(product)) {
                price = 0.45;
            } else if ("water".equalsIgnoreCase(product)) {
                price = 0.70;
            } else if ("beer".equalsIgnoreCase(product)) {
                price = 1.10;
            } else if ("sweets".equalsIgnoreCase(product)) {
                price = 1.35;
            } else if ("peanuts".equalsIgnoreCase(product)) {
                price = 1.55;
            }

        }
        double result = quantity * price;
        System.out.println(result);
    }
}
