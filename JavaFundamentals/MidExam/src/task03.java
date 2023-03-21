import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> movingTargets = Arrays.stream(sc.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
        String command = sc.nextLine();

        while (!command.equals("End")) {
            String[] commandParts = command.split(" ");
            String action = commandParts[0];
            int index = Integer.parseInt(commandParts[1]);
            int value = Integer.parseInt(commandParts[2]);
            switch (action) {
                case "Shoot":
                    if (checkForExistingIndex(index, movingTargets)) {
                        int currentNum = movingTargets.get(index);
                        currentNum -= value;
                        if (currentNum <= 0) {
                            movingTargets.remove(index);
                        } else {
                            movingTargets.set(index, currentNum);
                        }
                    }
                    break;
                case "Add":
                    if (checkForExistingIndex(index, movingTargets)) {
                        movingTargets.add(index, value);
                    } else {
                        System.out.println("Invalid placement!");
                    }
                    break;
                case "Strike":
                    boolean validRadius = movingTargets.size()-1 >= index
                            && movingTargets.size()-1 >= index + value
                            && index - value >= 0;
                    if (validRadius) {

                        for (int i = 0; i < movingTargets.size(); i++) {
                            if (i == index) {
                                for (int j = 1; j <= value; j++) {
                                    if (i - 1 >= 0) {
                                        movingTargets.remove(i - 1);
                                        i--;
                                    }
                                    if (i + 1 <= movingTargets.size() - 1) {
                                        movingTargets.remove(i + 1);
                                    } else {
                                    }
                                }

                            }
                        }
                    } else {
                        System.out.println("Strike missed!");
                    }
                    break;
            }
            command = sc.nextLine();
        }
        for (int i = 0; i < movingTargets.size(); i++) {
            if (i == movingTargets.size() - 1) {
                System.out.print(movingTargets.get(i) + "");
            } else {
                System.out.print(movingTargets.get(i) + "|");
            }
        }
    }


    private static boolean checkForExistingIndex(int index, List<Integer> list) {
        if (index <= list.size() - 1) {
            return true;
        }
        return false;
    }

}
