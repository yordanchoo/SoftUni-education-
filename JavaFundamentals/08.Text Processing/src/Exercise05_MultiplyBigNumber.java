import java.math.BigInteger;
import java.util.Scanner;

public class Exercise05_MultiplyBigNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        BigInteger first = new BigInteger(sc.nextLine());
        BigInteger secondNum = new BigInteger(sc.nextLine());


        BigInteger result = first.multiply(secondNum);
        System.out.println(result);
    }
}
