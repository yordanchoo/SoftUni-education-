import java.util.Scanner;

public class exVacation_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int groupCount = Integer.parseInt(scanner.nextLine());
        String groupType = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();
        double price = 0;

        switch (dayOfWeek){
            case "Friday":
                if (groupType.equals("Students")) {
                    price = 8.45;
                } else if (groupType.equals("Business")) {
                    price = 10.90;
                } else if (groupType.equals("Regular")) {
                    price = 15.0;
                }
                break;
            case "Saturday":
                if (groupType.equals("Students")) {
                    price = 9.80;
                } else if (groupType.equals("Business")) {
                    price = 15.60;
                } else if (groupType.equals("Regular")) {
                    price = 20.0;
                }
                break;
            case "Sunday":
                if (groupType.equals("Students")) {
                    price = 10.46;
                } else if (groupType.equals("Business")) {
                    price = 16;
                } else if (groupType.equals("Regular")) {
                    price = 22.50;
                }
                break;
        }
        double finalPrice = price * groupCount;

        if (groupType.equals("Students") && groupCount >= 30) {
            finalPrice *=  0.85;
        } else if (groupType.equals("Business") && groupCount >= 100) {
            finalPrice = finalPrice - 10 * price;
        } else if (groupType.equals("Regular") && groupCount >= 10 && groupCount <= 20) {
            finalPrice *= 0.95;
        }

        System.out.printf("Total price: %.2f",finalPrice);

    }
}
