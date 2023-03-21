import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise02_ChangeList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersList = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();
        while (!command.equals("end")) {
            //receive commands until "end" and manipulate depending on the commands
            String[] commandParts = command.split(" ");

            switch (commandParts[0]) {
                case "Delete":
                    //Delete {element} - delete all elements in the array, which are equal to the given element
                    int element = Integer.parseInt(commandParts[1]);
                    for (int i = 0; i < numbersList.size(); i++) {
                        if (element == numbersList.get(i)) {
                            numbersList.remove(i);
                        }
                    }
                    break;
                case "Insert":
                    //Insert {element} {position} - insert element at the given position
                    int number = Integer.parseInt(commandParts[1]);
                    int index = Integer.parseInt(commandParts[2]);
                    numbersList.add(index, number);
                    break;
            }
            command = sc.nextLine();

        }
        System.out.println(numbersList.toString().replaceAll("[\\[\\],]", ""));
    }
}

