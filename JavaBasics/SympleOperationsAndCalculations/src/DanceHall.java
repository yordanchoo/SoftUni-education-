import java.util.Scanner;

public class DanceHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double l = Double.parseDouble(scanner.nextLine());
        double w = Double.parseDouble(scanner.nextLine());
        double a = Double.parseDouble(scanner.nextLine());

        double hallTotal = (l * 100) * (w * 100);
        double wardrobeSize = (a * 100) * (a * 100);
        double benchSize = hallTotal / 10;
        double spaceLeft = hallTotal - wardrobeSize - benchSize;

        double dancers = spaceLeft / ( 40 + 7000);

        System.out.printf("%.0f",Math.floor(dancers));

    }
}
