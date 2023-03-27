package AssociativeArays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//You've beaten all the content and the last thing left to accomplish is own a legendary item.
//However, it's a tedious process and requires quite a bit of farming.
//Anyway, you are not too pretentious - any legendary will do. The possible items are:
//•	Shadowmourne - requires 250 Shards
//•	Valanyr - requires 250 Fragments
//•	Dragonwrath - requires 250 Motes
//Shards, Fragments and Motes are the key materials, all else is junk. You will be given lines of input, such as
//"2 motes 3 ores 15 stones". Keep track of the key materials - the first that reaches the 250 mark wins the race.
//At that point, print the corresponding legendary obtained.
//Then, print the remaining shards, fragments, motes, ordered by quantity in descending order, then by name in ascending order,
//each on a new line. Finally, print the collected junk items, in alphabetical order.
//Input
//•	Each line of input is in format {quantity} {material} {quantity} {material} … {quantity} {material}
//Output
//•	On the first line, print the obtained item in format {Legendary item} obtained!
//•	On the next three lines, print the remaining key materials in descending order by quantity
//o	If two key materials have the same quantity, print them in alphabetical order
//•	On the final several lines, print the junk items in alphabetical order
//o	All materials are printed in format {material}: {quantity}
//o	All output should be lowercase, except the first letter of the legendary
public class LegendaryFarming {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Integer> myMap = new LinkedHashMap<>();
        boolean toContinue = true;
        while (toContinue) {
            String[] input = scanner.nextLine().split(" ");
            for (int i = 0; i < input.length - 1; i++) {
                myMap.put(input[i + 1].toLowerCase(), Integer.valueOf(input[i]));
                if (myMap.containsKey("shards")) {
                    if (myMap.get("shards") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        myMap.put("shards", myMap.get("shards") - 250);
                        toContinue = false;
                        break;
                    }
                }
                if (myMap.containsKey("fragments")) {
                    if (myMap.get("fragments") >= 250) {
                        System.out.println("Shadowmourne obtained!");
                        myMap.put("fragments", myMap.get("fragments") - 250);
                        toContinue = false;
                        break;
                    }
                }
                if (myMap.containsKey("motes")) {
                    if (myMap.get("motes") >= 250) {
                        System.out.println("Dragonwrath obtained!");
                        myMap.put("motes", myMap.get("motes") - 250);
                        toContinue = false;
                        break;
                    }
                }
                i++;
            }
        }
        for (Map.Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
        }
    }
}

