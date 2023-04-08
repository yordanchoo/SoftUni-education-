import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise04_SoftUniParking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int commandsCount = Integer.parseInt(sc.nextLine());

        Map<String,String> usersMap = new LinkedHashMap<>();

        for (int i = 1; i <= commandsCount ; i++) {
            String[] userData = sc.nextLine().split(" ");
            String command = userData[0];
            String username = userData[1];

            switch (command) {
                case "register":
                    String licensePlate = userData[2];
                    if (!usersMap.containsKey(username)) {
                        usersMap.put(username,licensePlate);
                        System.out.printf("%s registered %s successfully%n",username,licensePlate);
                    } else {
                        System.out.printf("ERROR: already registered with plate number %s%n",licensePlate);
                    }
                    break;
                case "unregister":
                    if (usersMap.containsKey(username)) {
                        System.out.printf("%s unregistered successfully%n",username);
                        usersMap.remove(username);
                    } else {
                        System.out.printf("ERROR: user %s not found%n",username);
                    }
                    break;
            }
        }
        for (Map.Entry<String, String> entry : usersMap.entrySet()) {
            System.out.printf("%s => %s%n",entry.getKey(),entry.getValue());
        }

    }
}
