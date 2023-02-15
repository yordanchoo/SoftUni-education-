import java.util.Scanner;

public class inchesTOcm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Double inches = scanner.nextDouble();
        Double centimetres = inches * 2.54;

        System.out.printf("%.2f",centimetres);
    }
}
