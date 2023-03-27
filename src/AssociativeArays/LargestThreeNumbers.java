package AssociativeArays;
//Read a list of integers and print largest 3 of them. If there are less than 3, print all of them.

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LargestThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> sorted = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .sorted((n1, n2) -> n2.compareTo(n1))
                .collect(Collectors.toList());
        if(sorted.size() > 3) {
            for (int i = 0; i < 3; i++) {
                System.out.printf("%d ", sorted.get(i));
            }
        }else{
            for (int i = 0; i < sorted.size(); i++) {
                System.out.printf("%d ", sorted.get(i));
            }
        }
    }
}
