import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise04_ListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        // until "end" command , read commands
        while (!command.equals("End")) {
            String[] commandLine = command.split(" ");
            switch (commandLine[0]){
                case "Add":
                    //Add {number} - add number at the end
                    int number = Integer.parseInt(commandLine[1]);
                    numbersList.add(number);
                    break;
                case "Insert":
                    //Insert {number} {index} - insert number at given index
                    int num = Integer.parseInt(commandLine[1]);
                    int insertIndex = Integer.parseInt(commandLine[2]);
                    if (checkIndexBounds(insertIndex,numbersList)) {
                        System.out.println("Invalid index");
                        break;
                    } else {
                        numbersList.add(insertIndex,num);
                    }
                    break;
                case "Remove":
                    //Remove {index} - remove that index
                    int removeIndex = Integer.parseInt(commandLine[1]);
                    if (checkIndexBounds(removeIndex,numbersList)) {
                        System.out.println("Invalid index");
                        break;
                    } else {
                        numbersList.remove(removeIndex);
                    }
                    break;
                case "Shift":
                    int rotations = Integer.parseInt(commandLine[2]);
                    //Shift left {count} - first number becomes last 'count' times
                    if (commandLine[1].equals("left")) {
                        for (int i = 0; i < rotations ; i++) {
                            int currentFirst = numbersList.get(0);
                            numbersList.remove(0);
                            numbersList.add(currentFirst);
                        }
                    }
                    //Shift right {count} - last number becomes first 'count' times
                    if (commandLine[1].equals("right")) {
                        Collections.rotate(numbersList,rotations);
                    }
                    break;

            }
            command = sc.nextLine();
        }
        for (int item : numbersList) {
            System.out.print(item + " ");
        }
    }
    //The index given may be outside of the bounds of the array. In that case print "Invalid index".
    private static boolean checkIndexBounds (int index,List<Integer> nums){
        if (index > nums.size()) {
            return true;
        }
        return false;
    }
}
