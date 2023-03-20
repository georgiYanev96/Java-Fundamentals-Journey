package Methods;

import java.util.Scanner;

//Write a method that receives two characters and prints on a single line
//all the characters in between them according to ASCII.
public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Character start = scanner.nextLine().charAt(0);
        Character end = scanner.nextLine().charAt(0);
        System.out.println(printCharsSequence(start,end));
    }

    private static String printCharsSequence(Character start, Character end) {
        StringBuilder result = new StringBuilder();
            for (int i = (int) start + 1; i < (int) end; i++) {
                result.append((char) i).append(" ");
            }
            if((int) end < (int) start){
                for (int i = (int) end - 1; i < (int) start; i++) {
                    result.append((char) i).append(" ");
                }
            }

        return result.toString();
    }
}
