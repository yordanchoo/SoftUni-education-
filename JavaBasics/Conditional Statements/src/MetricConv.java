import java.util.Scanner;

public class MetricConv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputNum = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();
        String output = scanner.nextLine();

        if ("mm".equalsIgnoreCase(input)) {
            inputNum = inputNum / 1000;
        } else if ("cm".equalsIgnoreCase(input)) {
            inputNum = inputNum / 100;
        }
        if ("mm".equalsIgnoreCase(output)) {
            inputNum   = inputNum * 1000;
        }else if ("cm".equalsIgnoreCase(output)){
            inputNum = inputNum * 100;
        }
        System.out.printf("%.3f",inputNum);
    }
}
