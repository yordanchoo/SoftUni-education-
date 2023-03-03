import java.util.Scanner;

public class exStrongNumber_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());
        int startingNum = num;

        int sumFact = 0;
        while (num > 0) {
            int lastDigit = num % 10;
            int fact = 1;
            for (int i = 1; i <= num ; i++) {
                fact = fact * i;
            }
            sumFact += fact;
            num = num / 10;
        }
        if (startingNum == sumFact) {
            System.out.println("yes");
        }
        else {
            System.out.println("no");
        }
    }
}
