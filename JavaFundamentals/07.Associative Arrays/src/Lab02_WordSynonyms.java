import java.util.*;

public class Lab02_WordSynonyms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<String>> synonymsMap = new HashMap<>();

        for (int i = 1; i <= n; i++) {
            String word = sc.nextLine();
            String synonym = sc.nextLine();
            if (!synonymsMap.containsKey(word)) {
                synonymsMap.put(word, new ArrayList<>());
                synonymsMap.get(word).add(synonym);
            } else {
                synonymsMap.get(word).add(synonym);
            }
        }

        for (Map.Entry<String, List<String>> entry : synonymsMap.entrySet()) {
            System.out.printf("%s - %s%n",entry.getKey(),String.join(", ", entry.getValue()));
        }

    }
}
