import java.util.Scanner;

public class ExerciseVacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double moneyNeeded = Double.parseDouble(scanner.nextLine());
        double income = Double.parseDouble(scanner.nextLine());
        boolean isSpend = false;
        int spendCount = 0;
        int daysCount = 0;
        while (income < moneyNeeded) {
            String action = scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            daysCount++;
            switch (action) {
                case "spend":
                    spendCount++;
                    income -= sum;
                    if (income < 0) {
                        income = 0;
                    }
                    break;
                case "save":
                    income += sum;
                    spendCount=0;
                    break;
            }
            if (spendCount == 5) {
                isSpend = true;
                break;
            }
        }
        if (isSpend){
            System.out.printf("You can't save the money.\n%d",daysCount);
        }else {
            System.out.printf("You saved the money for %d days.",daysCount);
        }
    }
}
