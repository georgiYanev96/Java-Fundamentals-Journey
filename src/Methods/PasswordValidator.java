package Methods;

import java.sql.SQLOutput;
import java.util.Scanner;

//Write a program that checks if a given password is valid. Password rules are:
//•	6 – 10 characters (inclusive);
//•	Consists only of letters and digits;
//•	Have at least 2 digits.
//If a password is valid, print "Password is valid". If it is not valid, for every unfulfilled rule print a message:
//•	"Password must be between 6 and 10 characters";
//•	"Password must consist only of letters and digits";
//•	"Password must have at least 2 digits".
public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(validatePassword(input));
    }

    private static String validatePassword(String input) {
        int digits = 0;
        StringBuilder result = new StringBuilder();
        if(input.length()  < 6 || input.length() > 10){
            result.append("Password must be between 6 and 10 characters").append(System.getProperty("line.separator"));
        }
        for (int i = 0; i < input.length(); i++) {
            if(!Character.isLetterOrDigit(input.charAt(i))){
                result.append("Password must consist only of letters and digits").append(System.getProperty("line.separator"));
                break;
            }
        }
        for (int i = 0; i < input.length(); i++) {
            if(Character.isDigit(input.charAt(i))){
                digits++;
            }
        }
        if(digits < 2){
            result.append("Password must have at least 2 digits").append(System.getProperty("line.separator"));
        }
        if(result.isEmpty()){
            result.append("Password is valid");
        }
        return result.toString();
    }
}
