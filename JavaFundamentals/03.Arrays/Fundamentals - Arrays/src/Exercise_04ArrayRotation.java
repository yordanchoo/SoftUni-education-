import java.util.Scanner;

public class Exercise_04ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbers = sc.nextLine().split(" ");
        int rotations = Integer.parseInt(sc.nextLine());
                                                    //51 47 32 61 21
        for (int i = 1; i <= rotations ; i++) {    //32 61 21 51 47
            String firstElement = numbers[0];
            for (int j = 0; j < numbers.length -1  ; j++) {
                numbers[j] = numbers [j + 1];
            }
            numbers[numbers.length - 1] = firstElement;

        }

        for ( String currentNum : numbers) {
            System.out.print(currentNum + " ");
        }
    }
}
