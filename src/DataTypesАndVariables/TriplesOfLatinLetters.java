package DataTypesАndVariables;

import java.util.Scanner;

//Write a program to read an integer n and print all triples of the first n small Latin letters, ordered alphabetically:
public class TriplesOfLatinLetters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            char firstLetter = (char) (i+97);
            for (int j = 0; j < n; j++) {
                char secondLetter = (char) (j+97);
                for (int k = 0; k < n; k++) {
                    char thirdLetter = (char) (k+97);
                    System.out.printf("%s%s%s%n", firstLetter, secondLetter, thirdLetter);
                }
            }
        }
    }
}
