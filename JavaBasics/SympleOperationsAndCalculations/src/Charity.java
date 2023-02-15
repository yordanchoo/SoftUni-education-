import java.util.Scanner;

public class Charity {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        int cooks = Integer.parseInt(scanner.nextLine());
        int cakes = Integer.parseInt(scanner.nextLine());
        int wafers = Integer.parseInt(scanner.nextLine());
        int pancakes = Integer.parseInt(scanner.nextLine());

        double cakesProfit = cakes * 45;
        double wafersProfit = wafers * 5.80;
        double panckakesProfit = pancakes * 3.20;

        double profitOneDay = (cakesProfit + wafersProfit + panckakesProfit) * cooks;
        double profitAllCampagne = profitOneDay * days;
        double expenses = profitAllCampagne - (profitAllCampagne / 8);

        System.out.printf("%.2f", expenses);
    }
}
