import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise03_Orders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String,Double> prdocutsPriceMap = new LinkedHashMap<>();
        Map<String,Integer> quantityMap = new LinkedHashMap<>();
        String commandLine = sc.nextLine();

        while (!commandLine.equals("buy")) {
            String[] inputData = commandLine.split(" ");
            String product = inputData[0];
            double price = Double.parseDouble(inputData[1]);
            int quantity = Integer.parseInt(inputData[2]);

            if (!prdocutsPriceMap.containsKey(product)){
                prdocutsPriceMap.put(product,price);
                quantityMap.put(product,quantity);
            } else {
                quantityMap.put(product,quantityMap.get(product) + quantity);
                if (price != prdocutsPriceMap.get(product)) {
                    prdocutsPriceMap.put(product,price);
                }
            }

            commandLine = sc.nextLine();
        }
        for (Map.Entry<String, Double> entry : prdocutsPriceMap.entrySet()) {
            String name = entry.getKey();
            double sum = entry.getValue() * quantityMap.get(name);
            System.out.printf("%s -> %.2f%n",entry.getKey(),sum);
        }


    }
}
