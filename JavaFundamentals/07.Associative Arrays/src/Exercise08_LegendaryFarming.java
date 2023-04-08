import java.util.*;

public class Exercise08_LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junkItems = new LinkedHashMap<>();
        boolean isObtained = false;
        while (!isObtained) {
            String[] inputLine = scanner.nextLine().split(" ");
            for (int i = 0; i < inputLine.length; i += 2) {
                String item = inputLine[i + 1].toLowerCase();
                int quantity = Integer.parseInt(inputLine[i]);

                if (item.equals("shards") || item.equals("fragments") || item.equals("motes")) {
                    int currentQuantity = materials.get(item);
                    materials.put(item, currentQuantity + quantity);
                } else {
                    if (!junkItems.containsKey(item)) {
                        junkItems.put(item, quantity);
                    } else {
                        int current = junkItems.get(item);
                        junkItems.put(item, current + quantity);
                    }
                }

                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isObtained = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isObtained = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isObtained = true;
                    break;
                }
            }
            if (isObtained) {
                break;
            }
        }

        materials.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        junkItems.entrySet().forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

