import java.util.Scanner;

public class Lab03_SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String forRemove = sc.nextLine();
        String word = sc.nextLine();

        //"ice" -> if it's contained in the word - remove all occurrences
        //word example -> "kicegiciceeb"
        //wanted result -> "kgb"

        int index = word.indexOf(forRemove);
        while (index != -1) {
           word = word.replace(forRemove,"");
           index = word.indexOf(forRemove);
        }
        System.out.println(word);


    }
}
