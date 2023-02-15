import java.util.Scanner;

public class trapezoidArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double area1 = Double.parseDouble(scanner.nextLine());
        double area2 = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double area = (area1+area2) *h /2;

        System.out.printf("%.2f",area);
    }
}
