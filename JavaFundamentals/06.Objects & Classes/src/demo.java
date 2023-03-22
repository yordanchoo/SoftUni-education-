import java.util.Scanner;

public class demo {
    static class Student {
        String name;
        String id;
        String course;

        private Student(String name,String id,String course){
            this.name = name;
            this.id = id;
            this.course = course;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public String getCourse() {
            return course;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student a = new Student("Yordan","9412","java");
        System.out.printf("Student: %s, with ID: %s , Current course: %s",a.getName(),a.getId(),a.getCourse());
    }
}
