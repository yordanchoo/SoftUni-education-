import java.util.Scanner;

public class PringAscii_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int startChar = Integer.parseInt(sc.nextLine());
        int endChar = Integer.parseInt(sc.nextLine());

        for (char asciiIndex = (char) startChar; asciiIndex <= endChar; asciiIndex++) {
            System.out.print(asciiIndex + " ");
        }
    }
}
