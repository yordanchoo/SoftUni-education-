import java.util.Scanner;

public class DataTypes_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputType = sc.nextLine();

        switch (inputType){
            case "int":
                int integerNumber = Integer.parseInt(sc.nextLine());
                printIntType(integerNumber);
                break;
            case "real":
                double doubleNumber = Double.parseDouble(sc.nextLine());
                printDoubleType(doubleNumber);
                break;
            case "string":
                String input = sc.nextLine();
                printStringType(input);
                break;

        }
    }
    private static void printIntType (int num) {
        System.out.println(num * 2);
    }
    private static void printDoubleType (double num) {
        System.out.printf("%.2f",num * 1.5);
    }
    private static void printStringType (String input) {
        System.out.println("$"+ input + "$");
    }
}
