import java.util.Scanner;

public class ExerciseExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());

        String taskName = scanner.nextLine();
        int poorGradeCount = 0;
        double gradesTotal = 0;
        int tasksCount = 0;
        String lastTask = "";
        while (!"Enough".equals(taskName)) {
            double grade = Double.parseDouble(scanner.nextLine());
            gradesTotal += grade;
            tasksCount++;
            if (grade <= 4) {
                poorGradeCount++;

            }if (poorGradeCount == badGrades){
                System.out.printf("You need a break, %d poor grades.",poorGradeCount);
                break;
            }
            lastTask = taskName;
            taskName = scanner.nextLine();
        }
        if ("Enough".equals(taskName)){
            double outputTotal = gradesTotal/tasksCount;
            System.out.printf("Average score: %.2f\nNumber of problems: %d\nLast problem: %s",
                    outputTotal,tasksCount,lastTask);
        }
    }
}
