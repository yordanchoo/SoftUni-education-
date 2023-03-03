import java.text.DecimalFormat;
import java.util.Scanner;

public class Lab08MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double number = Double.parseDouble(sc.nextLine());
        int raisingNum = Integer.parseInt(sc.nextLine());
        System.out.println(new DecimalFormat("0.###").format(printRaisedNumber(number,raisingNum)));
    }
    public static double printRaisedNumber (double num, int givenPower){
        double result = Math.pow(num,givenPower);
        return Math.pow(num,givenPower);
    }
}
