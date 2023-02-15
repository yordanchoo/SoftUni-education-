import java.util.Scanner;

public class ExerciseWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String command = scanner.nextLine();
        int goal = 10000;
        int totalSteps = 0;

        while (totalSteps <10000) {

            if ("Going home".equals(command)) {
                int stepsToHome = Integer.parseInt(command);
                totalSteps += stepsToHome;
                break;

            } else {
                command = scanner.nextLine();
                int stepsCurrent = Integer.parseInt(command);
                totalSteps += stepsCurrent;
            }
        }
        if (totalSteps >= 10000) {
            System.out.println("Goal reached! Good job!");
        } else {
            int result = goal - totalSteps;
            System.out.printf("%d more steps to reach goal.", result);
        }
    }
}