package ObjectsAndClasses;
import java.util.Random;
import java.util.Scanner;
//You are given a list of words on one line. Randomize their order and print each word on a separate line.

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = scanner.nextLine().split(" ");
        Random rnd = new Random();
        for (int pos1 = 0; pos1 < words.length; pos1++) {
            int pos2 = rnd.nextInt(words.length);
            String current = words[pos1];
            words[pos1]= words[pos2];
            words[pos2] = current;
        }
        System.out.println(String.join(
                System.lineSeparator(), words));
    }

}
