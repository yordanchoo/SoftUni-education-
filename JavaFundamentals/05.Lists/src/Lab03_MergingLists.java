import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab03_MergingLists {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> firstList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resultList = new ArrayList<>();
        //Create a result list that contains the numbers from both of the lists.
        int minSizeList = Integer.min(firstList.size(), secondList.size());

        for (int i = 0; i < minSizeList; i++) {
            //The first element should be from the first list, the second from the second list, and so on
            resultList.add(firstList.get(i));
            resultList.add(secondList.get(i));
        }
        //If the length of the two lists is not equal, just add the remaining elements at the end of the list.
        if (firstList.size() > secondList.size()) {
            resultList.addAll(firstList.subList(minSizeList, firstList.size()));
        } else {
            resultList.addAll(secondList.subList(minSizeList, secondList.size()));
        }
        for (int num : resultList) {
            System.out.print(num + " ");
        }
    }
}

