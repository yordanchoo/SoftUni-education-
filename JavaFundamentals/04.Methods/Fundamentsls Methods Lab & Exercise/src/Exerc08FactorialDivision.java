import java.util.Scanner;

public class Exerc08FactorialDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOne = Integer.parseInt(sc.nextLine());
        int numberTwo = Integer.parseInt(sc.nextLine());

        long factorialFirstNumber = calculateFactorial(numberOne);
        long factorialSecondNUmber = calculateFactorial(numberTwo);

        double resultDivision = factorialFirstNumber * 1.0 / factorialSecondNUmber;
        System.out.printf("%.2f",resultDivision);
    }
    private static long calculateFactorial (int number){
        int fact = 1;
        for (int i = 1; i <= number ; i++) {
            fact = fact * i;
        }
        return fact;
    }
}
