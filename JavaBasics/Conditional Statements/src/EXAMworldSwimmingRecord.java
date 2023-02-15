import java.util.Scanner;

public class EXAMworldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double recordInSec = Double.parseDouble(scanner.nextLine());
        double lenghtInM = Double.parseDouble(scanner.nextLine());
        double secForOneM = Double.parseDouble(scanner.nextLine());

        double SmoothDive = lenghtInM * secForOneM;
        double Resistance = (Math.floor(lenghtInM/ 15)) * 12.5;
        double Swimming_Total_Time = SmoothDive + Resistance;
        double Swimming_Time_Quit = Swimming_Total_Time - recordInSec;

       if (recordInSec > Swimming_Total_Time || Swimming_Total_Time == recordInSec){
           System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", Swimming_Total_Time);
       }else {
           System.out.printf("No, he failed! He was %.2f seconds slower.",Swimming_Time_Quit);
       }
    }

}
//"No, he failed! He was %.2f seconds slower."
