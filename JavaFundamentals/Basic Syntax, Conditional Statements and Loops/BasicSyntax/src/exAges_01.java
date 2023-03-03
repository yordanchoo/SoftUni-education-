import java.util.Scanner;

public class exAges_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = Integer.parseInt(scanner.nextLine());

        String gender = "";

        if (input >= 0 && input <= 2) {
            gender = "baby";
        } else if (input > 2 && input <= 13) {
            gender = "child";
        }else if (input > 13 && input <= 19) {
            gender = "teenager";
        }else if (input > 19 && input <= 65) {
            gender = "adult";
        }else {
            gender = "elder";
        }
        System.out.println(gender);
    }
}
