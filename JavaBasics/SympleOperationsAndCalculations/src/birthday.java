import java.util.Scanner;

public class birthday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int aqLength = Integer.parseInt(scanner.nextLine());
        int aqWidth = Integer.parseInt(scanner.nextLine());
        int aqHeight = Integer.parseInt(scanner.nextLine());
        double sandPercent = Double.parseDouble(scanner.nextLine());

        int aqVolume = aqLength * aqWidth *aqHeight;
        double aqVolumeDec = aqVolume * 0.001;
        double aqAllPercent = sandPercent * 0.01;
        double result = aqVolumeDec * ( 1 - aqAllPercent);

        System.out.printf("%.3f",result);

    }
}
