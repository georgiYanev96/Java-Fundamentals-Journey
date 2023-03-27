package AssociativeArays;
import java.util.*;

//Write a program that extracts from a given sequence of words all elements that
//are present in it an odd number of times (case-insensitive).
//•	Words are given in a single line, space separated
//•	Print the result elements in lowercase in their order of appearance
public class OddOccurencies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> myMap = new LinkedHashMap<>();
        String[] input = scanner.nextLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            String currentWord = input[i].toLowerCase();
            if(!myMap.containsKey(currentWord)){
                myMap.put(currentWord, 1);
            }else{
                myMap.put(currentWord, myMap.get(currentWord)+1);
            }
        }
        for(Map.Entry<String, Integer> entry: myMap.entrySet()){
            if(entry.getValue() % 2 != 0) {
                System.out.printf("%s - %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
