import java.util.Scanner;

public class BookPipesInPool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int poolVolume = Integer.parseInt(scanner.nextLine());
        int firstPipe = Integer.parseInt(scanner.nextLine());
        int secondPipe = Integer.parseInt(scanner.nextLine());
        double hoursMissing = Double.parseDouble(scanner.nextLine());

        double totalWater = firstPipe* hoursMissing + secondPipe * hoursMissing;
        if (totalWater <= poolVolume) {
                        System.out.printf("The pool is %.0f%% full." +
                                "Pipe 1: %.0f%%. Pipe 2: %.0f%%",
                                Math.floor(totalWater / poolVolume * 100),
                                Math.floor(firstPipe * hoursMissing / totalWater *100),
                                Math.floor(secondPipe * hoursMissing / totalWater* 100));
        }else {
            System.out.printf("For %s hours the pool overflows with %f liters",hoursMissing,
                    totalWater - poolVolume);
        }
    }

}
