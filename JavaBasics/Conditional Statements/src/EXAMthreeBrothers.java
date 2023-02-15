import java.util.Scanner;

public class EXAMthreeBrothers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double brotherOne = Double.parseDouble(scanner.nextLine());
        double brotherTwo = Double.parseDouble(scanner.nextLine());
        double brotherThree = Double.parseDouble(scanner.nextLine());
        double fishingTime = Double.parseDouble(scanner.nextLine());

        double cleaningTime = 1;
        double totalCleaningtime = cleaningTime / (cleaningTime / brotherOne + cleaningTime / brotherTwo +
                cleaningTime / brotherThree);
        double timeWithBreak = totalCleaningtime * 1.15;
        double totalTimeLeft = fishingTime - timeWithBreak;
        System.out.printf("Cleaning time: %.2f", timeWithBreak);
        System.out.println();

        if (totalTimeLeft >= 0) {
            System.out.printf("Yes, there is a surprise - time left -> %.0f hours."
                    , Math.floor(totalTimeLeft));
        } else {
            System.out.printf("No, there isn't a surprise - shortage of time -> %.0f hours.",
                    Math.ceil(Math.abs(totalTimeLeft)));
        }

    }
}
