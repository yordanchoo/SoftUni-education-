import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise01_CountChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] words = sc.nextLine().split(" ");

        Map<Character,Integer> charsCountMap = new LinkedHashMap<>();

        for (int i = 0; i < words.length ; i++) {
            String currentWord = words[i];
            for (int j = 0; j < currentWord.length() ; j++) {
                Integer currentValue = charsCountMap.get(currentWord.charAt(j));
                if (charsCountMap.containsKey(currentWord.charAt(j))) {
                    charsCountMap.put(currentWord.charAt(j),currentValue + 1);
                } else {
                    charsCountMap.put(currentWord.charAt(j),1);
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : charsCountMap.entrySet()) {
            System.out.printf("%c -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
