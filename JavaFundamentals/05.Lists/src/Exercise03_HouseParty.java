import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercise03_HouseParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int actionsCount = Integer.parseInt(sc.nextLine());
        List<String> guestsList = new ArrayList<>();
        //	1st type of input: "{name} is going!" or 2nd type : "{name} is not going!"
        for (int i = 1; i <= actionsCount; i++) {
            String commandLine = sc.nextLine();
            String[] commandParts = commandLine.split(" ");
            String name = commandParts[0];
            if (commandLine.contains("is going")) {

                if (guestsList.contains(name)) {
                    //If he/she is in the list print on the console: "{name} is already in the list!").
                    System.out.printf("%s is already in the list!%n", name);
                } else {
                    //first type of input, you have to add the person if he/she is not on the list.
                    guestsList.add(name);
                }

            }
            if (commandLine.contains("is not going")) {
                //If you receive the second type of input, you have to remove the person if he/she is on the list.
                if (guestsList.contains(name)) {
                    guestsList.remove(name);
                } else {
                    //If not print: "{name} is not in the list!")
                    System.out.printf("%s is not in the list!%n", name);

                }
            }
        }
        for (String item : guestsList) {
            System.out.printf("%s%n", item);
        }
    }
}
