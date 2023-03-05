import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab11MathOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = Integer.parseInt(sc.nextLine());
        String operator = sc.nextLine();
        int numberTwo = Integer.parseInt(sc.nextLine());
        System.out.println(new DecimalFormat("0.###").format(calculateResult(numberOne,operator,numberTwo)));

    }
    public static double calculateResult (double numOne,String operator, double numTwo){
        double result = 0.0;
        switch (operator){
            case "*":
                result = numOne * numTwo;
                break;
            case "/":
                result = numOne / numTwo;
                break;
            case "+":
                result = numOne + numTwo;
                break;
            case "-":
                result = numOne - numTwo;
                break;
        }
        return result;
    }
}
