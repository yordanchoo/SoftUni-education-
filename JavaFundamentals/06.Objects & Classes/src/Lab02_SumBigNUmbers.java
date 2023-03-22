import java.math.BigInteger;
import java.util.Scanner;

public class Lab02_SumBigNUmbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger firstNum = new BigInteger(sc.nextLine());
        BigInteger secondNum = new BigInteger(sc.nextLine());

        BigInteger result  = firstNum.add(secondNum);
        System.out.println(result);
    }
}
