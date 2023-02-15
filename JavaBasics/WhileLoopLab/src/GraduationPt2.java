import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        int expelCounter = 0;
        double gradeTotal = 0;
        while (counter <= 12) {
            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4) {
                gradeTotal += grade;
                counter++;
            } else {
              expelCounter++;
            }
            if (expelCounter == 2) {
                break;
            }

        }if (expelCounter != 2) {
            System.out.printf("%s graduated. Average grade: %.2f",
                    name, gradeTotal / 12);
        }else{
            System.out.printf("%s has been excluded at %d grade",
                    name,counter);
        }
    }

}

