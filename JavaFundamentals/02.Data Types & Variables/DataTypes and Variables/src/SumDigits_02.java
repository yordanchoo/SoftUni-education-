import java.util.Scanner;

public class SumDigits_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());  //245678
        int digitsSum = 0;

       while (num > 0){
           int lastDigit = num % 10;
           digitsSum+=lastDigit;
           num = num /10;
       }
        System.out.println(digitsSum);

    }
}
