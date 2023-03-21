package ListsAndAdvancedArrays;
//Write a program that reads sequence of numbers and special bomb number with a certain power.
//Your task is to detonate every occurrence of the special bomb number and according to its power - his neighbors from left and right.
//Detonations are performed from left to right and all detonated numbers disappear.
//Finally print the sum of the remaining elements in the sequence.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for (int i = 0; i < nums1.size(); i++) {
            if(nums1.get(i).equals(input[0])){
                nums1.remove(i);
                for (int j = 0; j < i; j++) {
                    nums1.remove(j);
                }
                for (int j = i; j < i + input[1]; j++) {
                    nums1.remove(j);
                }
            }
        }
        System.out.println(nums1);
    }
}
