package ListsAndAdvancedArrays;
//Read a list of integers, remove all negative numbers from it and print the remaining elements in reversed order.
//In case of no elements left in the list, print "empty".

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativesAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        nums1.removeIf(n -> n < 0);
        Collections.reverse(nums1);
        if(nums1.isEmpty()){
            System.out.println("empty");
        }else {
            System.out.println(nums1.toString().replaceAll("[\\[\\],]", ""));
        }
    }
}
