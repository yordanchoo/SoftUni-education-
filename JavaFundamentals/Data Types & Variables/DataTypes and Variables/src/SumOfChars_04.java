import java.util.Scanner;

public class SumOfChars_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0 ;
        for (int i = 0; i < n; i++) {
            char letter = sc.nextLine().charAt(0);
            sum +=  letter;
        }
        System.out.printf("The sum equals: %d",sum);
    }
}
