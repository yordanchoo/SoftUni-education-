import java.util.Scanner;

public class excersicePrintPartOfASCII {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int begin = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());

        for (int i = begin; i <= end; i++) {
            System.out.print((char) i + " ");
        }

    }
}
