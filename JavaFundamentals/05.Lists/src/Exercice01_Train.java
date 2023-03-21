import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercice01_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> numbersArr = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
            //create list of wagons, each integer - passangers on the wagon and int - max capacity of each wagon
        int maxCapacity = Integer.parseInt(sc.nextLine());
        String command = sc.nextLine();

        while (!command.equals("end")){
            //until "end" command read two types of input
            String[] commandParts = command.split(" ");
            if (commandParts[0].equals("Add")) {
                //•	Add {passengers} - add a wagon to the end with the given number of passengers
                int numOfPassengers = Integer.parseInt(commandParts[1]);
                numbersArr.add(numOfPassengers);

            } else {
                //{passengers} - find an existing wagon to fit all the passengers (starting from the first wagon)
                int addedPassengers = Integer.parseInt(commandParts[0]);
                for (int i = 0; i < numbersArr.size(); i++) {
                    if (numbersArr.get(i) + addedPassengers <= maxCapacity) {
                        int people = numbersArr.get(i) + addedPassengers;
                        numbersArr.remove(i);
                        numbersArr.add(i,people);
                        break;
                    }
                }
            }
            command = sc.nextLine();
        }
        //print the final state of the train (all the wagons separated by a space)
        System.out.println(numbersArr.toString().replaceAll("[\\[\\],]", ""));
    }
}
