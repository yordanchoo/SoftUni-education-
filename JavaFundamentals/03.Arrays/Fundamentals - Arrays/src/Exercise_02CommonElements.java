import java.util.Scanner;

public class Exercise_02CommonElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] firstRow = sc.nextLine().split(" ");
        String[] secondRow = sc.nextLine().split(" ");

        for (String elemSecondArray : secondRow) {
            for (String elemFirstArray : firstRow) {
                if (elemSecondArray.equals(elemFirstArray)) {
                    System.out.print(elemFirstArray + " ");
                    break;
                }
            }

        }
    }
}
