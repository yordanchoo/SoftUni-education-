import java.util.Scanner;

public class Lab01SignOfInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        printSignOfInteger(n);

    }
    public static void printSignOfInteger (int number){
        if (number > 0) {
            System.out.printf("The number %d is positive.",number);
        } else if (number < 0) {
            System.out.printf("The number %d is negative.",number);
        } else {
            System.out.printf("The number %d is zero.",number);
        }
    }
}
