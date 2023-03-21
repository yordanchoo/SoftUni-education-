import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise07_AppendArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();

        String[] numbersArrays = inputLine.split("\\|");
        List<String> outputList = new ArrayList<>();
        //append several arrays of numbers, arrays are separated by "|" , values by space or multiple spaces

        for (int i = 0; i < numbersArrays.length ; i++) {
        String[] currentArray = numbersArrays[i].split("\\s+");

            for (int j = currentArray.length-1; j >=0 ; j--) {
                if (!currentArray[j].equals("")) {
                    outputList.add(0,currentArray[j]);
                }
            }
        }
        for (String s : outputList) {
            System.out.print(s + " ");
        }
    }
}
