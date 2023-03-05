import java.util.Scanner;

public class Exerc01SmallestOfThreeNUm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        int numThree = Integer.parseInt(sc.nextLine());

        printSmallestInt(numOne,numTwo,numThree);
    }
    public static void printSmallestInt (int num1, int num2 ,int num3){
        if (num1 < num2 && num1 < num3) {
            System.out.println(num1);
        } else if (num2 < num1 && num2 < num3) {
            System.out.println(num2);
        } else {
            System.out.println(num3);
        }
    }
}
