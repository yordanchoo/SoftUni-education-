import java.util.Scanner;

public class exVendingMaschine_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String startingCommand = sc.nextLine();

        double instertedCoinsSum = 0.0;
        while (!startingCommand.equals("Start")) {
            double coins = Double.parseDouble(sc.nextLine());
            if (coins != 0.1 && coins != 0.2 && coins != 0.5 && coins != 1.0
                    && coins != 2.0) {
                System.out.printf("Cannot accept %.2f%n",coins);
            } else {
                instertedCoinsSum += coins;
            }

            startingCommand = sc.nextLine();
        }
        startingCommand = sc.nextLine();

        while (!startingCommand.equals("End")) {
            double productPrice = 0.0;
            switch (startingCommand){
                case "Nuts":
                    productPrice = 2.0;
                    break;
                case "Water":
                    productPrice = 0.7;
                    break;
                case "Crisps":
                    productPrice = 1.5;
                    break;
                case "Soda":
                    productPrice = 0.8;
                    break;
                case "Coke":
                    productPrice = 1.0;
                    break;
                default:
                    System.out.println("Invalid product");
                    break;
            }
            if (instertedCoinsSum >= productPrice) {
                System.out.printf("Purchased %s%n",startingCommand);
                instertedCoinsSum = instertedCoinsSum - productPrice;
            } else {
                System.out.println("Sorry, not enough money");
            }


            startingCommand = sc.nextLine();
        }
        if (instertedCoinsSum >= 0) {
            System.out.printf("Change: %.2f",instertedCoinsSum);
        }
    }
}

