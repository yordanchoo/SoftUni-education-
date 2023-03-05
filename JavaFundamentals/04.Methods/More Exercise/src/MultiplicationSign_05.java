import java.util.Scanner;

public class MultiplicationSign_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numOne = Integer.parseInt(sc.nextLine());
        int numTwo = Integer.parseInt(sc.nextLine());
        int numThree = Integer.parseInt(sc.nextLine());
        System.out.println(findAndPrintResultType(numOne,numTwo,numThree));

        //TODO fix to get 100 Judge
    }
    private static String findAndPrintResultType (int numOne,int numTwo, int numThree) {
        String result = "";
        if (numOne < 0 || numTwo < 0 || numThree < 0) {
            result = "negative";
        } else if (numOne > 0 || numTwo > 0 || numThree > 0) {
            result = "positive";
        } else if (numOne == 0 || numTwo == 0 || numThree == 0){
            result = "zero";
        }
        return result;
    }
}
