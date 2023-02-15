import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());

        int totaltime = first + second + third;
        int mins = totaltime / 60;
        int sec = totaltime % 60;

        if (sec < 10) {
            System.out.printf("%d:0%d", mins, sec);
        } else {
            System.out.printf("%d:%d",mins,sec);

        }

    }
}
