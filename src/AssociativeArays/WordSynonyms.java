package AssociativeArays;

import java.text.DecimalFormat;
import java.util.*;

//Write a program which keeps a map with synonyms.
//The key of the map will be the word.
//The value will be a list of all the synonyms of that word.
//You will be given a number n. On the next 2 * n lines you will be given a word and a synonym each on a separate line like this:
//•	{word}
//•	{synonym}
//If you get the same word for second time, just add the new synonym to the list.
//Print the words in the following format:
//{word} - {synonym1, synonym2… synonymN}
public class WordSynonyms {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeMap<String, ArrayList<String>> words = new TreeMap<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (2 * n > 0){
            String currentWord = scanner.nextLine();
            String synonym = scanner.nextLine();
            if(!words.containsKey(currentWord)){
                words.put(currentWord, new ArrayList<>());
                words.get(currentWord).add(synonym);
            }else{
                words.get(currentWord).add(synonym);
            }
            n--;
        }
        for(Map.Entry<String, ArrayList<String>> entry: words.entrySet()){
            StringBuilder valueSet = new StringBuilder();
            for (int i = 0; i < entry.getValue().size(); i++) {
                valueSet.append(entry.getValue().get(i)).append(", ");
            }
            System.out.printf("%s - %s%n", entry.getKey(), valueSet);
        }
    }

}
