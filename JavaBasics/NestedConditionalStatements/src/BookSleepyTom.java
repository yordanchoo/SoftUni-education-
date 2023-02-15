import java.util.Scanner;

public class BookSleepyTom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOff = Integer.parseInt(scanner.nextLine());
        int workingDays = 365 - daysOff;
        int totalMinsForPlay = (workingDays * 63) + (daysOff * 127);

        double diff = Math.abs(totalMinsForPlay - 30000);
        double hours = totalMinsForPlay * 60;
        double mins = totalMinsForPlay % 60;

        if (totalMinsForPlay > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%s hours and %s minutes more for play",Math.floor(hours),Math.floor(mins));
        }else {
            System.out.println("Tom sleeps well");
            System.out.printf("%s hours and %s minutes more for play",Math.floor(hours),Math.floor(mins));
        }
    }
}