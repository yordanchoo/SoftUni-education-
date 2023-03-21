import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class task02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> dungeonRooms = Arrays.stream(sc.nextLine().split("\\|"))
                .map(String::toString).collect(Collectors.toList());

        int initialHealth = 100;
        int initialBtc = 0;
        boolean questMade = true;
        for (int position = 0; position < dungeonRooms.size(); position++) {
            String[] currentCommand = dungeonRooms.get(position).split(" ");

            if (currentCommand[0].equals("potion")) {
                int healingNum = Integer.parseInt(currentCommand[1]);
                initialHealth += healingNum;
                if (initialHealth > 100) {
                    initialHealth = 100;
                }
                System.out.printf("You healed for %d hp.%n",healingNum);
                System.out.printf("Current health: %d hp.%n",initialHealth);

            }
            else if (currentCommand[0].equals("chest")) {
                int bitcoinsFound = Integer.parseInt(currentCommand[1]);
                initialBtc+=bitcoinsFound;
                System.out.printf("You found %d bitcoins.%n",bitcoinsFound);
            }
            else {
                String monster = currentCommand[0];
                int attackPower = Integer.parseInt(currentCommand[1]);
                initialHealth-=attackPower;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n",monster);
                } else {
                    System.out.printf("You died! Killed by %s.%n",monster);
                    System.out.printf("Best room: %d",position+1);
                    questMade = false;
                    break;
                }
            }
        }
        if (questMade) {
            System.out.printf("You've made it!%nBitcoins: %d%nHealth: %d",initialBtc,initialHealth);
        }


    }
}
