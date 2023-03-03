import java.util.Arrays;
import java.util.Scanner;

public class Exercise_09ArrayModifier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        String command = sc.nextLine();

//"swap {index1} {index2}" takes two elements and swap their places.
//"multiply {index1} {index2}" takes element at the 1st index and multiply it with the element at 2nd index. Save the product at the 1st index.
//"decrease" decreases all elements in the array with 1.


        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String commandType = commandParts[0];

            switch (commandType) {
                case "swap":
                    int index1 = Integer.parseInt(commandParts[1]);
                    int index2 = Integer.parseInt(commandParts[2]);
                    int elem1 = numbersArr[index1];
                    int elem2 = numbersArr[index2];

                    numbersArr[index1] = elem2;
                    numbersArr[index2] = elem1;

                    break;
                case "multiply":
                    int multiplyIndex1 = Integer.parseInt(commandParts[1]);
                    int multiplyIndex2 = Integer.parseInt(commandParts[2]);
                    int multiplyElement1 = numbersArr[multiplyIndex1];
                    int multiplyElement2 = numbersArr[multiplyIndex2];

                    numbersArr[multiplyIndex1] = multiplyElement1 * multiplyElement2;

                    break;
                case "decrease":
                    for (int i = 0; i <= numbersArr.length - 1; i++) {
                        numbersArr[i] -= 1;
                    }
                    break;

            }

            command = sc.nextLine();
        }
        for (int i = 0; i <= numbersArr.length - 1; i++) {
            if (i != numbersArr.length-1) {
                System.out.print(numbersArr[i]+ ", ");
            } else {
                System.out.print(numbersArr[i]);
            }

        }
    }
}
