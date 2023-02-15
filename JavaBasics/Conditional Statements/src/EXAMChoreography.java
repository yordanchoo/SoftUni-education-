import java.util.Scanner;

public class EXAMChoreography {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double steps = Double.parseDouble(scanner.nextLine());
        double dancers = Double.parseDouble(scanner.nextLine());
        double days = Double.parseDouble(scanner.nextLine());

        double stepsPerDay = Math.ceil(100 / days);
        double percStepsDancer = stepsPerDay / dancers;

        if (stepsPerDay <= 13){
            System.out.printf("Yes, they will succeed in that goal! " + "%.2f",
                    percStepsDancer);
            System.out.println("%.");
        }else{
            System.out.printf("No, they will not succeed in that goal! Required " + "%.2f",
                    percStepsDancer);
            System.out.println("% steps to be learned per day.");
        }

    }
}
