import java.util.Scanner;

public class exPrintAndSum_04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        for (int i = start; i <= end; i++) {
            sum += i;
            System.out.print(i + " ");

        }
        System.out.println();
        System.out.printf("Sum: %d",sum);
    }
}
