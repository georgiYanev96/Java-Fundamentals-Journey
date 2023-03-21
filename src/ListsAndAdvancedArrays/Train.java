package ListsAndAdvancedArrays;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
//On the first line you will be given a list of wagons (integers).
//Each integer represents the number of passengers that are currently in each wagon.
//On the next line you will get the max capacity of each wagon (single integer).
//Until you receive "end" you will be given two types of input:
//•	Add {passengers} - add a wagon to the end with the given number of passengers
//•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
//At the end print the final state of the train (all the wagons separated by a space)

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums1 = Arrays.stream(scanner.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        int maxCapacity = Integer.parseInt(scanner.nextLine());
        boolean toContinue = true;
        while (toContinue){
            List<String> input = Arrays.stream(scanner.nextLine().split(" ")).collect(Collectors.toList());
            if(input.get(0).equals("end")){
                toContinue = false;
            }
            if(input.get(0).equals("Add") ){
                nums1.add(Integer.valueOf(input.get(1)));
            }else if (!input.get(0).equals("Add") && !input.get(0).equals("end")){
                for (int i = 0; i < nums1.size(); i++) {
                    int sum = nums1.get(i) + Integer.parseInt(input.get(0));
                    if(sum <= maxCapacity){
                        nums1.set(i, sum);
                        break;
                    }
                }
            }
        }
        System.out.println(nums1.toString().replaceAll("[\\[\\],]", ""));

    }
}
