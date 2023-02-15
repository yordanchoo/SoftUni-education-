import java.util.Scanner;

public class EXAMScholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double income = Double.parseDouble(scanner.nextLine());
        double grade = Double.parseDouble(scanner.nextLine());
        double wage = Double.parseDouble(scanner.nextLine());

        double scholarship = 0;
        double excellent = 0;
        if (income < wage && grade > 4.5) {
            scholarship = wage * 0.35;
            if (grade >= 5.5){
                excellent = grade * 25;
            }
        }if (scholarship == 0 && excellent == 0){
            System.out.println("You cannot get a scholarship!");
        }else if (scholarship != 0 && scholarship > excellent){
            System.out.printf("You get a Social scholarship %.0f BGN",
                    Math.floor(scholarship));
        }else if (excellent != 0 && excellent >= scholarship){
            System.out.printf("You get a scholarship for excellent results %.0f BGN",
                    Math.floor(excellent));
        }

    }

}
