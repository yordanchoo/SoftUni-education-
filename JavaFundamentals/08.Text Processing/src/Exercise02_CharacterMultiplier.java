import java.util.Scanner;

public class Exercise02_CharacterMultiplier {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] name = sc.nextLine().split(" ");
        char[] firstName = name[0].toCharArray();
        char[] secondName = name[1].toCharArray();

        int sum = charsSum(firstName, secondName);

        System.out.println(sum);
    }

    private static int charsSum(char[] first, char[] second) {
        int sum = 0;
        //"George" "Peter" -> multiply str1[0] with str2[0] etc. and add to sum
        //If one of the strings is longer than the other, add the remaining char codes to the total sum without multiplication.
        if (first.length > second.length) {
            for (int i = 0; i < first.length; i++) {
                if (i <= second.length - 1) {
                    sum += first[i] * second[i];
                } else {
                    sum += first[i];
                }
            }
            return sum;
        } else if (second.length > first.length) {
            for (int i = 0; i < second.length; i++) {
                if (i <= first.length - 1) {
                    sum += second[i] * first[i];
                } else {
                    sum += second[i];
                }
            }
            return sum;
        } else {
            for (int i = 0; i < first.length; i++) {
                sum += first[i] * second[i];
            }
            return sum;
        }

    }

}

