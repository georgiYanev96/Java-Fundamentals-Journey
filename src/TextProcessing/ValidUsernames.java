package TextProcessing;
//Write a program that reads user names on a single line (joined by ", ") and prints all valid usernames.
//A valid username is:
//•	Has length between 3 and 16 characters
//•	Contains only letters, numbers, hyphens and underscores
//•	Has no redundant symbols before, after or in between.

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(", ");
        for (int i = 0; i < input.length; i++) {
            if(input[i].length() > 2 && input[i].length() < 15 && input[i].matches("^[a-zA-Z0-9]+([_-][a-zA-Z0-9]+)*$")){
                System.out.println(input[i]);

            }
        }
    }
}
