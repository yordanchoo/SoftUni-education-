import java.util.Scanner;

public class exTriangleOfnumbers_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for (int row = 1; row <= num ; row++) {
            for (int i = 1; i <= row ; i++) {
                System.out.print(row + " ");
            }
            System.out.println();
        }
    }
}
