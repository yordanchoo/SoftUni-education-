import java.util.Scanner;

public class Exerc04PasswordValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        boolean isPasswordLengthValid = checkPassLength(password);
        if (!isPasswordLengthValid) {
            System.out.println("Password must be between 6 and 10 characters");
        }

        boolean isPasswordContentVaid = checkPassSymbols(password);
        if (!isPasswordContentVaid) {
            System.out.println("Password must consist only of letters and digits");
        }

        boolean isPasswordRangeValid = checkPassDigits(password);
        if (!isPasswordRangeValid){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordLengthValid && isPasswordContentVaid && isPasswordRangeValid) {
            System.out.println("Password is valid");
        }
    }
    //Password must be between 6 and 10 characters: true
    //else : false
    private static boolean checkPassLength (String password) {
        int symbolsCount = 0 ;
        for (char symbol:password.toCharArray()) {
            symbolsCount++;
        }
        if (symbolsCount >= 6 && symbolsCount <=10) {
            return true;
        } else {

            return false;
        }
    }
    //Password must consist only of letters and digits: true
    // else : false
    private static boolean checkPassSymbols (String password) {
        for (char symbol:password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)) {
                return false;
            }
        }
        return true;
    }
    //Password must have at least 2 digits: true
    //else : false
    private static boolean checkPassDigits (String password) {
        int digitsCount = 0 ;
        for (char symbol:password.toCharArray()) {
            if (Character.isDigit(symbol)) {
                digitsCount++;
            }
        }
        if (digitsCount < 2) {
            return false;
        } else {
            return true;
        }
    }
}

