import java.util.Scanner;

public class Lab05Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String product = sc.nextLine();
        int quantity = Integer.parseInt(sc.nextLine());
        calculateAndPrintTotal(product,quantity);

    }
    public static void calculateAndPrintTotal (String productType, int quantityInput){

        switch (productType){
            case "coffee":
                System.out.printf("%.2f",quantityInput * 1.50);
                break;
            case "water":
                System.out.printf("%.2f",quantityInput * 1.00);
                break;
            case "coke":
                System.out.printf("%.2f",quantityInput * 1.40);
                break;
            case "snacks":
                System.out.printf("%.2f",quantityInput * 2.00);
        }
    }

}
