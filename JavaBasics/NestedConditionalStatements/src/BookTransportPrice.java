import java.util.Scanner;

public class BookTransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int km = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();

        double priceTotal = 0;
        double taxiTax = 0;
        if ("day".equalsIgnoreCase(input)) {
            taxiTax = 0.79;
        } else if ("night".equalsIgnoreCase(input)) {
            taxiTax = 0.90;
        }
        if (km < 20) {
            priceTotal = 0.70 + (taxiTax * km);
        } else if (km < 100) {
            priceTotal = 0.09 * km;
        } else {
            priceTotal = 0.06 * km;
        }
        System.out.println(priceTotal);
    }
}
