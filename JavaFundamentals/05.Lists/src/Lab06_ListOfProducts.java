import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab06_ListOfProducts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<String> productsList = new ArrayList<>();

        // Print a numbered list of all the products ordered by name.
        for (int i = 1; i <= n ; i++) {
            String inputLine = sc.nextLine();
            productsList.add(i-1,inputLine);

        }
        List<String> sortedList = productsList.stream().sorted().collect(Collectors.toList());

        int startingNum = 0;
        for (String item:sortedList) {
            startingNum++;
            System.out.printf("%d.%s%n",startingNum,item);
        }
    }
}
