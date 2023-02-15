import java.util.Scanner;

public class ExerciseOldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String book = scanner.nextLine();
        int capacity = Integer.parseInt(scanner.nextLine());
        boolean wanedBook = true;
        String bookInput = scanner.nextLine();
        int counter = 0;
        while (!bookInput.equals(book)) {
            counter++;
            if (counter == capacity) {
                wanedBook = false;
                break;
            }
            bookInput = scanner.nextLine();
        }
        if (wanedBook){
            System.out.printf("You checked %d books and found it.",counter);
        }else{
            System.out.printf("The book you search is not here!\nYou checked %d books.",counter);
        }
    }

}
