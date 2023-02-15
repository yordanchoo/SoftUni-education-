import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commission = -1;

        if ("sofia".equalsIgnoreCase(city)) {  //sofia
            if (sales > 0 && sales <= 500) {
                commission = sales * 0.05;
            }
            if (sales > 500 && sales <= 1000) {
                commission = sales * 0.07;
            }
            if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.08;
            }
            if (sales > 10000) {
                commission = sales * 0.12;
            }

        } else if ("varna".equalsIgnoreCase(city)) {                         //varna
            if (sales > 0 && sales <= 500) {
                commission = sales * 0.045;
            }
            if (sales > 500 && sales <= 1000) {
                commission = sales * 0.075;
            }
            if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.1;
            }
            if (sales > 10000) {
                commission = sales * 0.13;
            }

        } else if ("plovdiv".equalsIgnoreCase(city)) {                        //plovdiv
            if (sales > 0 && sales <= 500) {
                commission = sales * 0.055;
            }
            if (sales > 500 && sales <= 1000) {
                commission = sales * 0.08;
            }
            if (sales > 1000 && sales <= 10000) {
                commission = sales * 0.12;
            }
            if (sales > 10000) {
                commission = sales * 0.145;
            }

        }
        if (commission > 0) {
            System.out.printf("%.2f",commission);
        } else {
            System.out.println("error");
        }
    }

}
