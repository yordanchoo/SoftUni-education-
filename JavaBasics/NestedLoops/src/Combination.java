import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int validComb = 0;
        for (int x1 = 0; x1 <= n; x1++) {
            for (int x2 = 0; x2 <= n; x2++) {
                for (int x3 = 0; x3 <= n; x3++) {
                    for (int x4 = 0; x4 <= n; x4++) {
                        for (int x5 = 0; x5 <= n; x5++) {
                            if (x1 + x2 + x3 + x4 + x5 == n) {
                                validComb++;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(validComb);
    }
}
