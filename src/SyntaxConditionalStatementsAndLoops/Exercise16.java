package SyntaxConditionalStatementsAndLoops;

import java.util.Scanner;

//You will be given a string representing a username.
//The password will be that username reversed.
// Until you receive the correct password print on the console "Incorrect password. Try again.".
//When you receive the correct password print "User {username} logged in."
//However on the fourth try if the password is still not correct print "User {username} blocked!" and end the program.
public class Exercise16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();

        StringBuilder password = new StringBuilder();
        // append a string into StringBuilder input1
        password.append(username);
        // reverse StringBuilder input1
        password.reverse();
        String pass = password.toString();

        for (int i = 0; i <= 4 ; i++) {
            if(i == 3){
                System.out.printf("User %s blocked!",username);
                break;
            }
            String input = scanner.nextLine();
            if(input.equals(pass)){
                System.out.printf("User %s logged in.",username);
                break;
            }else{
                System.out.println("Incorrect password. Try again.");
            }
        }

    }
}
