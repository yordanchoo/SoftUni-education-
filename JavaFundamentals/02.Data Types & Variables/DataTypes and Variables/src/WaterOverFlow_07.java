import java.util.Scanner;

public class WaterOverFlow_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //tank capacity = 255
        int inputs = Integer.parseInt(sc.nextLine());
        int litresInTank = 0;
        int totalCapacity = 255;
        while (inputs > 0) {
            int pouringLitres = Integer.parseInt(sc.nextLine());
            if (litresInTank + pouringLitres <= totalCapacity){

                litresInTank += pouringLitres;
            } else {
                System.out.println("Insufficient capacity!");
            }
            inputs--;
        }
        System.out.println(litresInTank);
    }
}
