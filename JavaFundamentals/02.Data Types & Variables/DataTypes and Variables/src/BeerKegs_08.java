import java.util.Scanner;

public class BeerKegs_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        double kegMax = Double.MIN_VALUE;
        int count = 0;
        String biggestKeg = "";

        while (count < n){
            for (int singleKeg = 1; singleKeg <= n; singleKeg++) {
                count++;
                String kegModel = sc.nextLine();
                double radius = Double.parseDouble(sc.nextLine());
                int height = Integer.parseInt(sc.nextLine());
                double volume = Math.PI * (Math.pow(radius,2) * height);
                if (volume > kegMax) {
                    kegMax = volume;
                    biggestKeg = kegModel;
                }
            }
        }
        System.out.println(biggestKeg);
    }
}
