package ListsAndAdvancedArrays;
//Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
//Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
//Print even – print all the numbers that are even separated by a space
//Print odd – print all the numbers that are odd separated by a space
//Get sum – print the sum of all the numbers
//Filter ({condition} {number}) – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="

import java.nio.file.LinkPermission;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean toContinue = true;
        while (toContinue) {
            String command = scanner.nextLine();
            if (command.equals("end")) {
                toContinue = false;
            }
            if (command.contains("Contains")) {
                List<String> input = Arrays.stream(command.split(" "))
                                .collect(Collectors.toList());
                System.out.println(checkIfContains(nums1, input.get(1)));
            }
            if (command.contains("Print even")) {
                System.out.println(getEvenNumbersFromIntList(nums1));
            }
            if (command.contains("Print odd")) {
                System.out.println(getOddNumbersFromIntList(nums1));
            }
            if (command.contains("Get sum")) {
                System.out.println(getSumOfIntListsElements(nums1));
            }
            if (command.contains("Filter")) {
                List<String> input = Arrays.stream(command.split(" "))
                        .collect(Collectors.toList());
                String condition1 = input.get(1);
                int condition2 = Integer.parseInt(input.get(2));
                System.out.println(getFilteredNumbersByCondition(nums1, condition1, condition2));
            }
        }
    }

    private static String getFilteredNumbersByCondition(List<Integer> nums1, String condition1, int condition2) {
        StringBuilder output = new StringBuilder();
        switch (condition1){
            case "<":
                for (int i = 0; i < nums1.size(); i++) {
                    if(nums1.get(i) < condition2){
                        output.append(nums1.get(i)).append(" ");
                    }
                }
                break;
            case ">":
                for (int i = 0; i < nums1.size(); i++) {
                    if(nums1.get(i) > condition2){
                        output.append(nums1.get(i)).append(" ");
                    }
                }
                break;
            case ">=":
                for (int i = 0; i < nums1.size(); i++) {
                    if(nums1.get(i) >= condition2){
                        output.append(nums1.get(i)).append(" ");
                    }
                }
                break;
            case "<=":
                for (int i = 0; i < nums1.size(); i++) {
                    if(nums1.get(i) <= condition2){
                        output.append(nums1.get(i)).append(" ");
                    }
                }
                break;
        }
        return output.toString();
    }

    private static int getSumOfIntListsElements(List<Integer> nums1) {
        int sum = 0;
        for (int i = 0; i < nums1.size(); i++) {
            sum += nums1.get(i);
        }
        return sum;
    }

    private static String getOddNumbersFromIntList(List<Integer> nums1) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) % 2 != 0){
                output.append(nums1.get(i)).append(" ");
            }
        }
        return output.toString();
    }

    private static String getEvenNumbersFromIntList(List<Integer> nums1) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i) % 2 == 0){
                output.append(nums1.get(i)).append(" ");
            }
        }
        return output.toString();
    }

    private static String checkIfContains(List<Integer> nums1, String s) {
        if(nums1.contains(Integer.parseInt(s))){
            return "Yes";
        }else{
            return "No such number";
        }
    }
}

