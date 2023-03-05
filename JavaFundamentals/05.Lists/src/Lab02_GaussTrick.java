import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab02_GaussTrick {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numsList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        // 1 2 3 4 5 -> 6 2 3 4 -> 6 6 3
        int listSize = numsList.size();
        for (int i = 0; i < listSize / 2; i++) {
            numsList.set(i,numsList.get(i)+numsList.get(numsList.size()-1));
            numsList.remove(numsList.size()-1);

        }

        for (int item:numsList) {
            System.out.print(item + " ");
        }
    }
}
