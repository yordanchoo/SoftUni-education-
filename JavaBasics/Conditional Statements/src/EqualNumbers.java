import java.util.Scanner;

public class EqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());


        if (num1 == num2 && num1 == num3) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
