import java.util.Scanner;

public class Exercise_03ZigZagArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lines = Integer.parseInt(sc.nextLine());

        String[] firstArray = new String[lines];
        String[] secondArray = new String[lines];

        for (int row = 1; row <= lines ; row++) {
            String[] numbers = sc.nextLine().split(" ");   // чета число на всеки ред , сплитнато по спейс
            String firstNumber = numbers[0];  // запазвам в променлива , 1 число
            String secondNumber = numbers[1]; // запазвам в променлива , 2 число

            // четен ред , първо число , 2 масив , второ число 1 масив
            //нечетен ред , първо число в 1 масив , второ число във 2 масив
            if (row % 2 == 0 ) {
                firstArray[row - 1] = secondNumber;
                secondArray[row - 1] = firstNumber;
            } else {
                firstArray[row - 1] = firstNumber;
                secondArray[row - 1 ] = secondNumber;
            }
        }
        System.out.println(String.join(" ",firstArray));
        System.out.println(String.join(" ",secondArray));


    }
}
