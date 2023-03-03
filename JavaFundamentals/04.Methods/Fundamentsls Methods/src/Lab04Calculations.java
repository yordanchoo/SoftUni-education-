import java.util.Scanner;

public class Lab04Calculations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        int numberOne = Integer.parseInt(sc.nextLine());
        int numberTwo = Integer.parseInt(sc.nextLine());

        switch (command){
            case "add":
                add(numberOne,numberTwo);
                break;
            case "multiply":
                multiply(numberOne,numberTwo);
                break;
            case "subtract":
                subtract(numberOne,numberTwo);
                break;
            case "divide":
                divide(numberOne,numberTwo);
                break;
        }
    }
    public static void add (int numOne ,int numTwo) {
        System.out.println(numOne + numTwo);
    }
    public static void multiply (int numOne ,int numTwo) {
        System.out.println(numOne * numTwo);
    }
    public static void subtract (int numOne ,int numTwo) {
        System.out.println(numOne - numTwo);
    }
    public static void divide (int numOne ,int numTwo) {
        System.out.println(numOne / numTwo);
    }
}
