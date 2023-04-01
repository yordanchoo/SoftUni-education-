import java.util.*;
import java.util.stream.Collectors;

public class Lab01_CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Double> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Double::parseDouble).collect(Collectors.toList());

        Map<Double, Integer> numsCountMap = new TreeMap<>();

        for (double currentNum : numbersList) {
            Integer currentValue = numsCountMap.get(currentNum);
            if (numsCountMap.containsKey(currentNum)) {
                numsCountMap.put(currentNum, currentValue + 1);
            } else {

                numsCountMap.put(currentNum, 1);
            }
        }

        for (Map.Entry<Double, Integer> entry : numsCountMap.entrySet()) {
            System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }


    }
}
