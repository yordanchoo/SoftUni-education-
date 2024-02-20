import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab02_MatchPhoneNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String phones = sc.nextLine();
        Pattern matchNums = Pattern.compile("\\+359([- ])2\\1[\\d]{3}\\1[\\d]{3}\\b");
        Matcher matcher = matchNums.matcher(phones);

        List<String> matchedPhones = new LinkedList<>();
        while (matcher.find()){
            matchedPhones.add(matcher.group());
        }
        System.out.println(String.join(", ",matchedPhones));
    }
}
