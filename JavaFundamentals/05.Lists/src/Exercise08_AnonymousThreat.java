import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Exercise08_AnonymousThreat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> text = Arrays.stream(sc.nextLine().split(" "))
                .map(String::toString).collect(Collectors.toList());
        //single input line containing STRINGS separated by spaces.
        String command = sc.nextLine();
        while (!command.equals("3:1")) {
            //1st : merge {startIndex} {endIndex}
            if (command.split(" ")[0].equals("merge")) {
                int startIndex = Integer.parseInt(command.split(" ")[1]);
                int endIndex = Integer.parseInt(command.split(" ")[2]);
                if (startIndex < 0) {
                    startIndex = 0;
                }
                if (endIndex > text.size() - 1) {
                    endIndex = text.size() - 1;
                }
                boolean isValidIndex = startIndex <= text.size() - 1 && endIndex >= 0 && startIndex < endIndex;
                //{abc, def, ghi} -> merge 0 1 -> {abcdef, ghi}
                if (isValidIndex) {
                    String resultMerge = "";
                    for (int i = startIndex; i <= endIndex; i++) {
                        String currentText = text.get(i);
                        resultMerge += currentText;
                    }
                    for (int index = startIndex; index <= endIndex; index++) {
                        text.remove(startIndex);
                    }

                    text.add(startIndex, resultMerge);
                }


            } else if (command.split(" ")[0].equals("divide")) {
                //2nd : divide {index} {partitions}
                int index = Integer.parseInt(command.split(" ")[1]);
                int parts = Integer.parseInt(command.split(" ")[2]);

                //{abcdef, ghi, jkl}
                String elementForDivide = text.get(index); //"abcdef"
                text.remove(index); //{ghi, jkl}

                int partSize = elementForDivide.length() / parts;
                int beginIndexOfText = 0;

                for (int part = 1; part < parts; part++) {
                    text.add(index, elementForDivide.substring(beginIndexOfText, beginIndexOfText + partSize));
                    //{ab, cd, ghi, jkl}
                    index++;
                    beginIndexOfText += partSize;
                }
                text.add(index, elementForDivide.substring(beginIndexOfText));
            }
            command = sc.nextLine();
        }
        System.out.println(String.join(" ",text));

    }
}
