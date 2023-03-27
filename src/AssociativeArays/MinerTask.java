package AssociativeArays;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

//Until you receive "stop" command, you will be given a sequence of strings, each on a new line.
//Every odd line on the console is representing a resource (e.g. Gold, Silver, Copper, etc.) and every even - quantity.
//Your task is to collect the resources and print them each on a new line.
//Print the resources and their quantities in format: {resource} –> {quantity}
//The quantities inputs will be in the range [1 … 2 000 000 000]
public class MinerTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedHashMap<String, Long> myMap = new LinkedHashMap<>();
        boolean toContinue = true;
        while (toContinue){
            String input = scanner.nextLine();
            if(!input.equals("stop")){
                long quantity = Long.parseLong(scanner.nextLine());
                if(myMap.containsKey(input)) {
                    myMap.put(input, myMap.get(input) + quantity);
                }else{
                    myMap.put(input, quantity);
                }
            }else{
                toContinue = false;
                break;
            }
        }
        for(Map.Entry<String, Long> entry: myMap.entrySet()){
                System.out.printf("%s -> %d%n", entry.getKey(), entry.getValue());
        }

    }
}
