import java.util.Scanner;

public class exOrders_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int orders = Integer.parseInt(sc.nextLine());
        int daysCount = 0;
        double price = 0.0;

        while (daysCount < orders) {
            daysCount++;
            float capsulePrice = Float.parseFloat(sc.nextLine());
            int days = Integer.parseInt(sc.nextLine());
            int capsulesCount = Integer.parseInt(sc.nextLine());
            double priceTotal = (days * capsulesCount) * capsulePrice;
            System.out.printf("The price for the coffee is: $%.2f\n",priceTotal);
            price += priceTotal;
        }
        System.out.printf("Total: $%.2f", price);
    }
}
