import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Lab05_ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbersArr = Arrays.stream(sc.nextLine().split(" ")).
                map(Integer::parseInt).collect(Collectors.toList());

        String inputLine = sc.nextLine();
        // until "end" command :
        while (!inputLine.equals("end")) {
            String[] commandParts = inputLine.split(" ");
            switch (commandParts[0]) {
                case "Contains":
                    // Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
                    int number = Integer.parseInt(commandParts[1]);
                    if (!checkIfTheNumIsContained(numbersArr, number)) {
                        System.out.println("No such number");
                    } else {
                        System.out.println("Yes");
                    }
                    break;
                case "Print":
                    //Print even – print all the numbers that are even separated by a space
                    //Print odd – print all the numbers that are oddly separated by a space
                    if (commandParts[1].equals("even")) {
                        printEvenNumbers(numbersArr);
                    } else if (commandParts[1].equals("odd")) {
                        printOddNUmbers(numbersArr);
                    }
                    break;
                case "Get":
                    //Get sum – print the sum of all the numbers
                    printSum(numbersArr);
                    break;
                case "Filter":
                    //Filter {condition} {number} – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
                    String condition = commandParts[1];
                    int conditionNumber = Integer.parseInt(commandParts[2]);
                    switch (condition) {
                        case "<":
                            for (int i = 0; i < numbersArr.size(); i++) {
                                if (numbersArr.get(i) < conditionNumber) {
                                    System.out.print(numbersArr.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">":
                            for (int i = 0; i < numbersArr.size(); i++) {
                                if (numbersArr.get(i) > conditionNumber){
                                    System.out.print(numbersArr.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case ">=":
                            for (int i = 0; i < numbersArr.size(); i++) {
                                if (numbersArr.get(i) >= conditionNumber){
                                    System.out.print(numbersArr.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;
                        case "<=":
                            for (int i = 0; i < numbersArr.size(); i++) {
                                if (numbersArr.get(i) <= conditionNumber){
                                    System.out.print(numbersArr.get(i) + " ");
                                }
                            }
                            System.out.println();
                            break;

                    }

            }

            inputLine = sc.nextLine();
        }

    }

    private static boolean checkIfTheNumIsContained(List<Integer> numbers, int num) {
        return numbers.contains(num);
    }

    private static void printEvenNumbers(List<Integer> numsList) {
        for (int i = 0; i < numsList.size(); i++) {
            if (numsList.get(i) % 2 == 0) {
                System.out.print(numsList.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printOddNUmbers(List<Integer> nums) {
        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 != 0) {
                System.out.print(nums.get(i) + " ");
            }
        }
        System.out.println();
    }

    private static void printSum(List<Integer> numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.size(); i++) {
            sum += numbers.get(i);
        }
        System.out.println(sum);
    }


}

