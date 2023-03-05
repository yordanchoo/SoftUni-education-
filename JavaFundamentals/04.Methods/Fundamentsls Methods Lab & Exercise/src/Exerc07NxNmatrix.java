import java.util.Scanner;

public class Exerc07NxNmatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        printMatrix(num);
    }

    private static void printMatrix (int number) {
        for (int row = 0; row < number; row++) {
            for (int li = 0; li < number; li++) {
                System.out.print(number + " ");;
            }
            System.out.println();
        }
    }

}
