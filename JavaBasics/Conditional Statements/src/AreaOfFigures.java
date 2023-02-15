import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        double area = 0;

        switch (figure) {
            case "square":
                double a = Double.parseDouble(scanner.nextLine());
                area = a * a;
                break;
            case "rectangle":
                double c = Double.parseDouble(scanner.nextLine());
                double b = Double.parseDouble(scanner.nextLine());
                area = c * b;
                break;
            case "circle":
                double d = Double.parseDouble(scanner.nextLine());
                area = Math.PI * d * d;
                break;
            case "triangle":
                double e = Double.parseDouble(scanner.nextLine());
                double f = Double.parseDouble(scanner.nextLine());
                area = (e * f) / 2;
                break;

        }
        System.out.printf("%.3f", area);
    }
}
