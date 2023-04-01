import java.util.*;

public class Exercise05_Students {
    public static class Student {
        private String firstName;
        private String lastName;
        private double grade;

        public Student (String firstName, String lastName, double grade){
            this.firstName = firstName;
            this.lastName = lastName;
            this.grade = grade;
        }

        public double getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return String.format("%s %s: %.2f",this.firstName, this.lastName,this.grade); }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int studentsCount = Integer.parseInt(sc.nextLine());
        List<Student> studentsList = new ArrayList<>();

        for (int i = 1; i <=studentsCount ; i++) {
            String[] studentData = sc.nextLine().split(" ");
            String firstName = studentData[0];
            String lastName = studentData[1];
            double grade = Double.parseDouble(studentData[2]);

            Student currentStudent = new Student(firstName,lastName,grade);
            studentsList.add(currentStudent);
        }
        studentsList.sort(Comparator.comparing(Student::getGrade).reversed());
        for (Student current : studentsList){
            System.out.println(current.toString());
        }
    }
}
