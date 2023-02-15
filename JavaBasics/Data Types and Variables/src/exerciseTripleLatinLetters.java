import java.util.Scanner;

public class exerciseTripleLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int begin = 97;
        int end = begin + input;
        for (int i = begin; i < end; i++) {
            for (int j = begin; j < end; j++) {
                for (int k = begin; k < end; k++) {
                    System.out.printf("%c%c%c%n",i,j,k);
                }
            }
        }

    }
}
