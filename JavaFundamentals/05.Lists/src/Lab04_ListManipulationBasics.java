import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab04_ListManipulationBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        Add {number}: add a number to the end of the list
//        Remove {number}: remove a number from the list
//        RemoveAt {index}: remove a number at a given index
//        Insert {number} {index}: insert a number at a given index
//        Note: All the indices will be valid!

        List<Integer> numsList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();
        while (!command.equals("end")) {
            String[] commandParts = command.split(" ");
            String mainCommand = commandParts[0];
            switch (mainCommand) {
                case "Add":
                    String numberAdded = commandParts[1];
                    int num = Integer.parseInt(numberAdded);
                    numsList.add(num);
                    break;
                case "Remove":
                    String numberRemoved = commandParts[1];
                    int number = Integer.parseInt(numberRemoved);
                    numsList.remove(number);
                    break;
                case "RemoveAt":
                    int removeIndex = Integer.parseInt(commandParts[1]);
                    numsList.remove(removeIndex);
                    break;
                case "Insert":
                    String insertNum = commandParts[1];
                    String atIndex = commandParts[2];
                    int insertedNum = Integer.parseInt(insertNum);
                    int insertAtIndex = Integer.parseInt(atIndex);
                    numsList.add(insertAtIndex, insertedNum);

                    break;
            }
            command = sc.nextLine();
        }
        for (int num:numsList){
            System.out.print(num + " ");
        }
    }



}
