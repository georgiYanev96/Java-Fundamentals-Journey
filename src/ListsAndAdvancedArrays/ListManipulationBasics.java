package ListsAndAdvancedArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a program that reads a list of integers. Then until you receive "end", you will be given different commands:
//Add {number}: add a number to the end of the list
//Remove {number}: remove a number from the list
//RemoveAt {index}: remove a number at a given index
//Insert {number} {index}: insert a number at a given index
//Note: All the indices will be valid!
//When you receive the "end" command print the final state of the list (separated by spaces)
public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        boolean toContinue = true;
        while (toContinue){
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            if(input.get(0).equals("end")){
                toContinue = false;
            }
            String command = input.get(0);
            switch (command){
                case "Add":
                    nums1.add(Integer.parseInt(input.get(1)));
                    break;
                case "Remove":
                    nums1.remove(Integer.parseInt(input.get(1)));
                    break;
                case "RemoveAt":
                    nums1.remove(Integer.parseInt(input.get(1)));
                    break;
                case "Insert":
                    nums1.add(Integer.parseInt(input.get(2)), Integer.parseInt(input.get(1)));
                    break;
            }
        }
        System.out.println(nums1.toString().replaceAll("[\\[\\],]", ""));


    }
}
