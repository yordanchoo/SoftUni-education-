import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise05_BombNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] numWithPower = sc.nextLine().split(" ");
        int bombNumber = Integer.parseInt(numWithPower[0]);
        int power = Integer.parseInt(numWithPower[1]);
        //detonate every occurrence of the special bomb number and according to its power - his neighbors from left and right

        for (int i = 0; i < numbersList.size(); i++) {
            //detonation from left to right and all detonated numbers disappear.
            if (numbersList.get(i) == bombNumber) {
                for (int j = 1; j <= power; j++) {
                    if (i - 1 >= 0) {
                        numbersList.remove(i-1);
                        i--;
                    }
                    if (i + 1 <= numbersList.size()-1) {
                        numbersList.remove(i+1);
                    }
                }
            }
        }
        int sum = 0;
        for (int index = 0; index < numbersList.size() ; index++) {
            if (numbersList.get(index) != bombNumber) {
                sum+=numbersList.get(index);
            }
            else {
                numbersList.remove(index);
                index--;
            }
        }

        System.out.println(sum);
    }
}
