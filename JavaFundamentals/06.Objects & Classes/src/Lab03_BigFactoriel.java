import java.math.BigInteger;
import java.util.Scanner;

public class Lab03_BigFactoriel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        BigInteger bigNum = new BigInteger(String.valueOf(1));
        for (int i = 1; i <= num; i++) {
            bigNum = bigNum.multiply(BigInteger.valueOf(i));

        }
        System.out.println(bigNum);
    }
}
