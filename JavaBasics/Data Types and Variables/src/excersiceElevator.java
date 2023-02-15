import java.util.Scanner;

public class excersiceElevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int persons = scanner.nextInt();
        int capacity = scanner.nextInt();

        int fullCourses = persons / capacity;
        if (persons % capacity != 0) {
            fullCourses++;
        }
        System.out.println(fullCourses);

    }
}
