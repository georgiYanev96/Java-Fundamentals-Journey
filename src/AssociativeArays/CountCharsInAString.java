package AssociativeArays;
//Write a program, which counts all characters in a string except space (' ').
//Print all occurrences in the following format:
//{char} -> {occurrences}

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountCharsInAString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        LinkedHashMap<Character, Integer> data = new LinkedHashMap<>();
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[i].length(); j++) {
               if (data.containsKey(input[i].charAt(j))){
                   data.put(input[i].charAt(j), data.get(input[i].charAt(j))+ 1);
               }else {
                   data.put(input[i].charAt(j), 1);
               }
            }
        }
       for(Map.Entry<Character, Integer> entry: data.entrySet()){
                System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
