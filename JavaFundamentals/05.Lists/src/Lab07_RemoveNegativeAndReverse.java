import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab07_RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        // remove negative numbers , print remaining elements in reversed order , if no elements print "empty"
        numbersArr.removeIf(e -> e < 0);
        Collections.reverse(numbersArr);

        if (numbersArr.size() == 0){
            System.out.println("empty");
        } else {
            System.out.println(numbersArr.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
