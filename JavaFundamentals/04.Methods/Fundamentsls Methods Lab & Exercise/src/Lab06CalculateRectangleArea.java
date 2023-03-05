import java.util.Scanner;

public class Lab06CalculateRectangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int width = Integer.parseInt(sc.nextLine());
        int length = Integer.parseInt(sc.nextLine());
        System.out.println(calculateArea(width,length));
    }
    public static int calculateArea (int w , int l ){
        return w * l;
    }
}
