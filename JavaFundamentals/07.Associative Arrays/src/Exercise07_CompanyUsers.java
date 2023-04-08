import java.util.*;

public class Exercise07_CompanyUsers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputLine = sc.nextLine();

        LinkedHashMap<String, List<String>> employeesMap = new LinkedHashMap<>();

        while (!inputLine.equals("End")) {
            String[] commandParts = inputLine.split(" -> ");
            String company = commandParts[0];
            String id = commandParts[1];

            if (!employeesMap.containsKey(company)) {
                employeesMap.put(company, new ArrayList<>());
                employeesMap.get(company).add(id);
            } else {
                boolean checker = false;
                for (int i = 0; i < employeesMap.get(company).size(); i++) {
                    if (employeesMap.get(company).get(i).equals(id)) {
                        checker = true;
                        break;
                    }
                }
                if (!checker) {
                    employeesMap.get(company).add(id);
                }
            }

            inputLine = sc.nextLine();
        }

        for (Map.Entry<String, List<String>> entry : employeesMap.entrySet()) {
            System.out.printf("%s%n", entry.getKey());
            for (String item : entry.getValue()) {
                System.out.printf("-- %s%n", item);
            }
        }

    }
}
