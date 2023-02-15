import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price =0;
        boolean wrongDay = false;


        if ("monday".equalsIgnoreCase(day) || "tuesday".equalsIgnoreCase(day) || "wednesday".equalsIgnoreCase(day) ||
                "thursday".equalsIgnoreCase(day) || "friday".equalsIgnoreCase(day)) {
            switch (fruit) {
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
                default:
                    wrongDay = true;
                    break;
            }
        } else if ("saturday".equalsIgnoreCase(day) || "sunday".equalsIgnoreCase(day)) {
            switch (fruit) {
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
                default:
                    wrongDay = true;
                    break;
            }
        }else {
            wrongDay = true;
        }

        if (wrongDay) {
            System.out.println("error");
        } else {
            double finalResult = price * quantity;
            System.out.printf("%.2f", finalResult);
        }

    }

}
