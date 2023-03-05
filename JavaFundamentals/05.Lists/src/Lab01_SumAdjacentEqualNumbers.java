import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab01_SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //3 3 6 1  6 6 1  12 1
        List<Double> numsList = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());
        for (int i = 0; i < numsList.size() - 1; i++) {
            if (numsList.get(i).equals(numsList.get(i + 1))) {
                numsList.set(i,numsList.get(i) + numsList.get(i+1));
                numsList.remove(i +1);
                i = -1;
            }
        }
        System.out.println(joinElements(numsList," "));

    }
    private static String joinElements (List<Double> numbers,String delimiter){
        String result = "";
        for (double item:numbers){
            result+= (new DecimalFormat("0.#").format(item)+delimiter);
        }
        return result;
    }
}
