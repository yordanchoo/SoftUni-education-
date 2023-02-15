import java.util.Scanner;

public class AlcoholMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double whiskeyBgnPrice = Double.parseDouble(scanner.nextLine());
        double beer = Double.parseDouble(scanner.nextLine());
        double wine = Double.parseDouble(scanner.nextLine());
        double rakija = Double.parseDouble(scanner.nextLine());
        double whiskey = Double.parseDouble(scanner.nextLine());
        //ceni za litar
        double rakijaPricePerL = whiskeyBgnPrice - (0.5 * whiskeyBgnPrice);
        double winePricePerL = rakijaPricePerL - (0.4 * rakijaPricePerL);
        double beerPricePerL = rakijaPricePerL - (0.8 * rakijaPricePerL);
        //ceni po otdelno
        double rakijaSum = rakija * rakijaPricePerL;
        double wineSum = wine * winePricePerL;
        double beerSum = beer * beerPricePerL;
        double whiskeySum = whiskey * whiskeyBgnPrice;
        //cqla suma
        double total = rakijaSum + wineSum + beerSum + whiskeySum;
        System.out.printf("%.2f",total);

    }
}
