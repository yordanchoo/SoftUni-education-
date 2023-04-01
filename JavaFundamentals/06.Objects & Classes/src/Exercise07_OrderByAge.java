import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Exercise07_OrderByAge {
    public static class Person {
        private String name;
        private String id;
        private int age;

        public Person (String name,String id,int age) {
            this.name = name;
            this.id = id;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public String getId() {
            return id;
        }

        public int getAge() {
            return age;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Person> peopleList = new ArrayList<>();
        String inputLine = sc.nextLine();
        while (!inputLine.equals("End")){
            String[] peopleData = inputLine.split(" ");
            String personName = peopleData[0];
            String personId = peopleData[1];
            int personAge = Integer.parseInt(peopleData[2]);

            Person currentPerson = new Person(personName,personId,personAge);
            peopleList.add(currentPerson);

            inputLine = sc.nextLine();
        }
        peopleList.sort(Comparator.comparing(Person::getAge));
        for(Person current : peopleList){
            System.out.printf("%s with ID: %s is %d years old.%n"
                    ,current.getName(),current.getId(),current.getAge());
        }
    }
}
