import java.util.*;
import java.util.spi.AbstractResourceBundleProvider;

public class Exercise09_ForceBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputLine = sc.nextLine();
        Map<String, List<String>> usersMap = new LinkedHashMap<>();

        //"{force_user} -> {force_side}"
        while (!inputLine.equals("Lumpawaroo")) {
            if (inputLine.contains("|")) {
                //"{force_side} | {force_user}" ->
                String side = inputLine.split(" \\| ")[0];
                String name = inputLine.split(" \\| ")[1];

                if (!usersMap.containsKey(side)) {
                    usersMap.put(side, new ArrayList<>());
                    usersMap.get(side).add(name);
                } else {
                    List<String> currentPlayers = usersMap.get(side);
                    if (!currentPlayers.contains(name)) {
                        currentPlayers.add(name);
                        usersMap.put(side, currentPlayers);
                    }
                }
            }
            if (inputLine.contains(" -> ")) {
                String user = inputLine.split(" -> ")[0];
                String team = inputLine.split(" -> ")[1];

                usersMap.entrySet().forEach(entry -> entry.getValue().remove(user));

                if (usersMap.containsKey(team)) {
                    List<String> currentPlayers = usersMap.get(team);
                    currentPlayers.add(user);
                    usersMap.put(team, currentPlayers);
                } else {
                    usersMap.put(team, new ArrayList<>());
                    usersMap.get(team).add(user);

                }
                System.out.printf("%s joins the %s side!%n", user, team);
            }

            inputLine = sc.nextLine();
        }
        usersMap.entrySet().stream().filter(entry -> entry.getValue().size() > 0)
                .forEach(entry -> {
                    System.out.printf("Side: %s, Members: %d%n", entry.getKey(), entry.getValue().size());
                    entry.getValue().forEach(player -> System.out.printf("! %s%n", player));
                });
    }
}
