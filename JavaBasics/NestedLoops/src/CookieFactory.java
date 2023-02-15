import java.util.Scanner;

public class CookieFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int batchesCount = Integer.parseInt(scanner.nextLine());
        boolean eggs = false;
        boolean flour = false;
        boolean sugar = false;

        for (int i = 1; i <= batchesCount; i++) {
            String product = scanner.nextLine();
            while (!"Bake!".equalsIgnoreCase(product)) {
                switch (product) {
                    case "eggs":
                        eggs = true;
                        break;
                    case "flour":
                        flour = true;
                        break;
                    case "sugar":
                        sugar = true;
                        break;
                }
                product = scanner.nextLine();
            }
            if (eggs && flour && sugar) {
                System.out.printf("Baking batch number %d...\n", i);
                eggs = false;
                flour = false;
                sugar = false;
            } else {
                System.out.printf("The batter should contain flour, eggs and sugar!\n");
                i--;
            }
        }

    }
}
