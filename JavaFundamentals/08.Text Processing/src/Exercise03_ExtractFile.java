import java.util.Scanner;

public class Exercise03_ExtractFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pathToFile = sc.nextLine();
        int endIndex = pathToFile.indexOf('.');
        int startIndex = 0;

        for (int i = 0; i < pathToFile.length(); i++) {
            if (pathToFile.charAt(i) == '\\') {
                startIndex = i + 1;
            }
        }
        String fileName = pathToFile.substring(startIndex, endIndex);
        String extension = pathToFile.substring(endIndex + 1);

        System.out.printf("File name: %s%nFile extension: %s",fileName,extension);
    }
}
