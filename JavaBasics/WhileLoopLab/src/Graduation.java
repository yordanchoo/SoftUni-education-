import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int counter = 1;
        double gradeSum =0;
        while (counter <= 12){

            double grade = Double.parseDouble(scanner.nextLine());
            if (grade >= 4){
                gradeSum += grade;
            counter++;
            }
        }
        System.out.printf("%s graduated. Average grade: %.2f"
                ,name,gradeSum/12);
    }
}
