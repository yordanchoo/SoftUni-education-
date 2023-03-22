import java.util.*;
import java.util.stream.Collectors;


public class Lab01_RandomiseWords {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> wordsList = Arrays.stream(sc.nextLine().split(" "))
                .collect(Collectors.toList());

        while (!wordsList.isEmpty()) {
            Random rnd = new Random();
            int randomIndex = rnd.nextInt(wordsList.size());

            String word = wordsList.get(randomIndex);
            System.out.println(word);
            wordsList.remove(randomIndex);

        }

    }
}

// SOLUTION WITH ARRAY :
//    String[] words = scanner.nextLine().split(" ");
//    Random random = new Random();
//
//        for (int i = 0; i < words.length-1; i++) {
//        int firstIndex = random.nextInt(words.length);
//        int secondIndex = random.nextInt(words.length);
//
//        String swapWord = words[firstIndex];
//        words[firstIndex] = words[secondIndex];
//        words[secondIndex] = swapWord;
//        }
//        System.out.println(String.join("\n",words));
//        }
//        }