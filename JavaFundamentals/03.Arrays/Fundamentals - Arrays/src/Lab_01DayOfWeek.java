import java.util.Scanner;

public class Lab_01DayOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        String[] daysOfWeek = {"Monday", "Tuesday", "Wednesday", "Thursday",
                "Friday", "Saturday", "Sunday"};
        if (num >= 1 && num <= 7 ) {
            System.out.println(daysOfWeek[num-1]);
        }
        else {
            System.out.println("Invalid day.");
        }


    }
}
