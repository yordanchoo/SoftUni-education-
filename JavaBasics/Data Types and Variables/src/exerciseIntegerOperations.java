import java.util.Scanner;

public class exerciseIntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        int fourth = scanner.nextInt();

        int result = ((first + second) / third) * fourth;
        System.out.println(result);
    }
}
