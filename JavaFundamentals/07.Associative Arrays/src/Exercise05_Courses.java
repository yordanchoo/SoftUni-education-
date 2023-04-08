import java.util.*;

public class Exercise05_Courses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Map<String, List<String>> coursesMap = new LinkedHashMap<>();

        String commandLine = sc.nextLine();
        while (!commandLine.equals("end")) {
            String[] inputData = commandLine.split(" : ");
            String courseName = inputData[0];
            String studentName = inputData[1];

            if (!coursesMap.containsKey(courseName)) {
                coursesMap.put(courseName,new ArrayList<>());
                coursesMap.get(courseName).add(studentName);
            } else {
                coursesMap.get(courseName).add(studentName);
            }

            commandLine = sc.nextLine();
        }
        coursesMap.forEach((key, value) -> {
            int studentsCount = coursesMap.get(key).size();
            System.out.printf("%s: %d%n", key, studentsCount);
            value.forEach(student -> System.out.println("-- " + student));
        });

    }
}
