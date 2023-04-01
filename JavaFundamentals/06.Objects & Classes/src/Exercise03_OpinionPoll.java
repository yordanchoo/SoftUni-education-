import java.util.Scanner;

public class Exercise03_OpinionPoll {
    public static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public int getAge() {
            return age;
        }

        public String getName() {
            return name;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int linesCount = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= linesCount; i++) {
            String inputLine = sc.nextLine();
            String name = inputLine.split(" ")[0];
            int age = Integer.parseInt(inputLine.split(" ")[1]);

            Person currentPerson = new Person(name,age);
            if (currentPerson.getAge() > 30){
                System.out.printf("%s - %d%n",currentPerson.getName(),currentPerson.getAge());
            }
        }

    }
}
