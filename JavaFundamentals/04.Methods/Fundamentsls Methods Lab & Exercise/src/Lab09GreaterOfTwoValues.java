import java.util.Scanner;

public class Lab09GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String type = sc.nextLine();
        switch (type){
            case "int":
                int firstValue = Integer.parseInt(sc.nextLine());
                int secondValue = Integer.parseInt(sc.nextLine());
                System.out.println(getMax(firstValue,secondValue));
                break;
            case "char":
                char firstChar = sc.nextLine().charAt(0);
                char secondChar = sc.nextLine().charAt(0);
                System.out.println(getMax(firstChar,secondChar));
                break;
            case "string":
                String firstString = sc.nextLine();
                String secondString = sc.nextLine();
                System.out.println(getMax(firstString,secondString));
                break;
        }
    }
    public static int getMax(int first, int second){
        if (first > second) {
            return first;
        }
        return second;
    }
    public static char getMax(char firstChar, char secondChar){
        if (firstChar > secondChar) {
            return firstChar;
        }
        return secondChar;
    }
    public static String getMax(String firstString, String secondString){
        if (firstString.compareTo(secondString) > 0) {
            return firstString;
        }
        return secondString;
    }
}
