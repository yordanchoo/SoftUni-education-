import java.util.Scanner;

public class Lab01_ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        while (!input.equals("end")) {
            String reversed = reverseString(input);
            System.out.printf("%s = %s",input,reversed);
            input = sc.nextLine();
        }
    }

    private static String reverseString(String input) {
        String reversed = "";
        for (int i = input.length()-1; i >= 0 ; i--) {
            reversed+= input.charAt(i);
        }
        return reversed;
    }
}
