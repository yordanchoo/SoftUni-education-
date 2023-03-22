import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab05_Students {
    static class Student {
        String firstName;
        String lastName;
        String age;
        String town;

        public Student(String firstName, String lastName, String age, String town) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return this.firstName;
        }

        public String getLastName() {
            return this.lastName;
        }

        public String getAge() {
            return this.age;
        }

        public String getTown() {
            return this.town;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();
        List<Student> studentsList = new ArrayList<>();
        while (!command.equals("end")) {
            String[] inputLine = command.split(" ");
            String getFirstName = inputLine[0];
            String getSecondName = inputLine[1];
            String getInputAge = inputLine[2];
            String getInputTown = inputLine[3];

            int index = indexOfStudent(studentsList,getFirstName,getSecondName);
            if (index == -1) {
                studentsList.add(new Student(getFirstName, getSecondName, getInputAge, getInputTown));
            } else {
                studentsList.set(index,new Student(getFirstName, getSecondName, getInputAge, getInputTown));
            }


            command = sc.nextLine();
        }

        String city = sc.nextLine();

        for (Student current : studentsList) {
            if (current.getTown().equals(city)) {
                System.out.printf("%s %s is %s years old%n",
                        current.getFirstName(),
                        current.getLastName(),
                        current.getAge());
            }
        }
    }

    private static int indexOfStudent(List<Student> studentList, String firstName, String lastName) {
        for (int i = 0; i < studentList.size(); i++) {
            Student a = studentList.get(i);
            if (a.getFirstName().equals(firstName) && a.getLastName().equals(lastName)) {
                return i;
            }
        }
        return -1;
    }
}
