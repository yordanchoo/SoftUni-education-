import java.util.Scanner;

public class Lab02Grades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        printGradeType(Double.parseDouble(sc.nextLine()));

    }
    public static void printGradeType (double num){
        String output = "";
        if (num >= 2.00 && num <= 2.99) {
            output = "Fail";
        } else if (num <= 3.49) {
            output = "Poor";
        } else if (num <= 4.49) {
            output = "Good";
        } else if (num <= 5.49) {
            output = "Very good";
        }else {
            output="Excellent";
        }
        System.out.println(output);
    }
}
