package ListsAndAdvancedArrays;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//Write a program to sum all adjacent equal numbers in a list of decimal numbers, starting from left to right.
//	After two numbers are summed, the obtained result could be equal to some of its neighbors and should be summed.
//	Always sum the leftmost two equal neighbors (if several couples of equal neighbors are available).

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Double::parseDouble)
                .collect(Collectors.toList());
        for (int i = 0; i < nums.size()-1; i++) {
            if(nums.get(i).equals(nums.get(i+1))){
                nums.set(i, (nums.get(i)+nums.get(i+1)));
                nums.remove(i+1);
                i=-1;
            }
        }
        System.out.println(joinElementsByDelimiter(nums, " "));
    }

    private static String joinElementsByDelimiter(List<Double> nums, String delimiter) {
        StringBuilder output = new StringBuilder();
        for (Double num : nums ) {
            output.append(new DecimalFormat("0.#").format(num)).append(delimiter);
        }
        return output.toString();
    }

}
