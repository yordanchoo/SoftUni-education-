import java.util.Scanner;

public class TriplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        for (char firstRow = 'a'; firstRow < 'a' + n; firstRow++) {
            for (char secondRow = 'a'; secondRow < 'a' + n; secondRow++) {
                for (char thirdRow = 'a'; thirdRow < 'a' + n; thirdRow++) {
                    System.out.printf("%c%c%c%n",firstRow,secondRow,thirdRow);
                }
            }
        }

    }
}
