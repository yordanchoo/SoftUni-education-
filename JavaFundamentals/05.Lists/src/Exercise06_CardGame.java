import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise06_CardGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> firstPlayer = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondPLayer = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        while (!(firstPlayer.size() < 1) && !(secondPLayer.size() < 1)){
            if (firstPlayer.get(0) > secondPLayer.get(0)) {
                int firstHand = firstPlayer.get(0);
                int secondHand = secondPLayer.get(0);
                secondPLayer.remove(0);
                firstPlayer.remove(0);
                firstPlayer.add(firstHand);
                firstPlayer.add(secondHand);
            } else if (secondPLayer.get(0) > firstPlayer.get(0)){
                int firstHand = firstPlayer.get(0);
                int secondHand = secondPLayer.get(0);
                firstPlayer.remove(0);
                secondPLayer.remove(0);
                secondPLayer.add(secondHand);
                secondPLayer.add(firstHand);
            } else {
                firstPlayer.remove(0);
                secondPLayer.remove(0);
            }
        }
        int sum = 0;
        if (firstPlayer.size() > secondPLayer.size()) {
            for (int num: firstPlayer) {
             sum+=num;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        } else {
            for (int num:secondPLayer) {
                sum+=num;
            }
            System.out.printf("First player wins! Sum: %d",sum);
        }
    }
}
