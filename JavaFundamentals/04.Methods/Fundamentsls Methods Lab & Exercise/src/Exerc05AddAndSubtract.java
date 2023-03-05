import java.util.Scanner;

public class Exerc05AddAndSubtract {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstDigit = Integer.parseInt(sc.nextLine());
        int secondDigit = Integer.parseInt(sc.nextLine());
        int thirdDigit = Integer.parseInt(sc.nextLine());

        int result = subtract(sumFirstTwoDigits(firstDigit,secondDigit),thirdDigit);
        System.out.println(result);

    }
    //method which sums first two digits
    public static int sumFirstTwoDigits (int firstNum, int secondNum) {
        return firstNum + secondNum;
    }
    //method which subtracts Sum from first two and third number
    public static int subtract(int numberOne,int numberTwo) {
        return numberOne - numberTwo;
    }
}
