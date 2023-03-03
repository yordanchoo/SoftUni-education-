import java.util.Scanner;

public class IntegerOperations_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numOne = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        int numThree = Integer.parseInt(sc.nextLine());
        int numFour = Integer.parseInt(sc.nextLine());

        int result = ((numOne + numTwo) / numThree) * numFour;

        System.out.println(result);


    }
}

