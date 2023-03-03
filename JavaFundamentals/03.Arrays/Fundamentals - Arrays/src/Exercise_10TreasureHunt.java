import java.util.Scanner;

public class Exercise_10TreasureHunt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loot (Pick up treasure loot along the way. Insert the items at the beginning of the chest.If an item is already contained, don't insert it.)
        // Drop (Remove the loot at the given position and add it at the end of the treasure chest.If the index is invalid, skip the command.)
        // Steal (Someone steals the last count loot items. If there are fewer items than the given count, remove as much as there are.Print the stolen items separated by ", "
        String[] initialLoot = sc.nextLine().split("\\|");

        String startingCommand = sc.nextLine();
        while (!startingCommand.equals("Yohoho!")) {
            String[] commandParts = startingCommand.split(" ");

            switch (commandParts[0]) {
                case "Loot":
                    for (int i = 1; i < commandParts.length; i++) {
                        boolean isContained = false;
                        for (int j = 0; j < initialLoot.length; j++) {
                            if (commandParts[i].equals(initialLoot[j])) {
                                isContained = true;
                                break;
                            }
                        }
                        if (!isContained) {
                            String newChest = commandParts[i] + " " + String.join(" ", initialLoot);
                            initialLoot = newChest.split(" ");
                        }
                    }
                    break;
                case "Drop":
                    int index = Integer.parseInt(commandParts[1]);
                    if (index <= initialLoot.length-1 && index >= 0) {
                        String dropItem = initialLoot[index];
                        for (int i = index; i < initialLoot.length-1; i++) {
                            initialLoot[i] = initialLoot[i+1];
                        }
                        initialLoot[initialLoot.length-1] = dropItem;
                    } else {
                        break;
                    }
                    break;
                case "Steal":
                    //TODO
                    break;

            }

            startingCommand = sc.nextLine();
        }
    }
}
//Output-average treasure gain, which is the sum of all treasure items length divided by the count of all items inside the chest formatted to the second decimal point
//If the chest is empty, print the following message:
//"Failed treasure hunt."