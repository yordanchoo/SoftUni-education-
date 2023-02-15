import java.util.Scanner;

public class TimePlusMinutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hour = Integer.parseInt(scanner.nextLine());
        int min = Integer.parseInt(scanner.nextLine());

        int timeInMin = hour * 60 + min;
        int timeAnd15 = timeInMin + 15;

        int finalHour = timeAnd15 / 60;
        int finalMin = timeAnd15 % 60;

        if (finalHour >= 24) {
            finalHour -= 24;
        }
        if (finalMin < 10){
            System.out.printf("%d:0%d",finalHour,finalMin);
        }else{
            System.out.printf("%d:%d",finalHour,finalMin);
        }
    }
}
