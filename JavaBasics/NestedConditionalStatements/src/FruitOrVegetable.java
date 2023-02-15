import java.util.Scanner;

public class FruitOrVegetable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.nextLine();

        if ("banana".equalsIgnoreCase(word) || "apple".equalsIgnoreCase(word) || "kiwi".equalsIgnoreCase(word) ||
                "cherry".equalsIgnoreCase(word) || "lemon".equalsIgnoreCase(word) || "grapes".equalsIgnoreCase(word)) {
            System.out.println("fruit");
        } else if ("tomato".equalsIgnoreCase(word) || "cucumber".equalsIgnoreCase(word) || "pepper".equalsIgnoreCase(word) ||
                "carrot".equalsIgnoreCase(word)) {
            System.out.println("vegetable");
        }else{
            System.out.println("unknown");
        }

    }
}

