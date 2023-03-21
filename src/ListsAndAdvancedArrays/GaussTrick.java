package ListsAndAdvancedArrays;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

//Write a program that sum all numbers in a list in the following order:
//first + last, first + 1 + last - 1, first + 2 + last - 2, … first + n, last - n.
public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int size = nums.size();

        for (int i = 0; i < size/2; i++) {
            nums.set(i, nums.get(i) + nums.get(nums.size()-1));
            nums.remove(nums.size()-1);
        }
        System.out.println(nums.toString().replaceAll("[\\[\\],]", ""));
    }
}
