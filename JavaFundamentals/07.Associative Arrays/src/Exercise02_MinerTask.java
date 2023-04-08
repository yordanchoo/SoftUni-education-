import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise02_MinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        Map<String, Integer> resourcesMap = new LinkedHashMap<>();

        while (!command.equals("stop")) {
            String resource = command;
            int quantity = Integer.parseInt(sc.nextLine());

            resourcesMap.putIfAbsent(resource,0);
            resourcesMap.put(resource,resourcesMap.get(resource) + quantity);


            command = sc.nextLine();
        }
        for (Map.Entry<String, Integer> entry : resourcesMap.entrySet()) {
            System.out.printf("%s -> %d%n",entry.getKey(),entry.getValue());
        }

    }
}
