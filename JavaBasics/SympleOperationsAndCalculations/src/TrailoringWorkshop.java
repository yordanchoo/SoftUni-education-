import java.util.Scanner;

public class TrailoringWorkshop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numTables = Integer.parseInt(scanner.nextLine());
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());

        double areaOneCover = numTables * (length + 2 * 0.30) * (width + 2 * 0.30);
        double areaOneKare = numTables * (length /2 ) * (length / 2);

        double resultUSD = areaOneCover * 7 + areaOneKare * 9 ;
        double resultBGN = resultUSD * 1.85;

        System.out.printf("%.2f USD\n",resultUSD);
        System.out.printf("%.2f BGN",resultBGN);


    }
}
