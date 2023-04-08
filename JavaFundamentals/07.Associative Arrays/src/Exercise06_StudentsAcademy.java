import java.util.*;

public class Exercise06_StudentsAcademy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = Integer.parseInt(sc.nextLine());
        Map<String, List<Double>> studentsMap =  new LinkedHashMap<>();

        for (int i = 1; i <= rows ; i++) {
            String currentStudent = sc.nextLine();
            double currentGrade = Double.parseDouble(sc.nextLine());

            if (!studentsMap.containsKey(currentStudent)) {
                studentsMap.put(currentStudent,new ArrayList<>());
            }
            studentsMap.get(currentStudent).add(currentGrade);
        }

        LinkedHashMap<String,Double> averageGradesMap = new LinkedHashMap<>();
        for (Map.Entry<String, List<Double>> entry : studentsMap.entrySet()) {
            double sum = getAverage(entry.getValue());
            if (sum >= 4.50) {
                averageGradesMap.put(entry.getKey(), sum);
            }
        }

        averageGradesMap.forEach((k,v) ->System.out.printf("%s -> %.2f%n",k,v));


    }
    private static double getAverage (List<Double> grades) {
        double sum = 0.0;
        for (int i = 0;  i < grades.size() ;  i++) {
            sum+=grades.get(i);
        }
        return sum / grades.size();
    }
}
