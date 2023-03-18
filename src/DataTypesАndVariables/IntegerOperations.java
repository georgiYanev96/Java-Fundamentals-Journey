package DataTypesАndVariables;

import java.util.Scanner;

//Read four integer numbers.
//Add first to the second, divide (integer) the sum by the third number and multiply the result by the fourth number.
// Print the result.
//Constraints
//•	First number will be in the range [-2,147,483,648… 2,147,483,647]
//•	Second number will be in the range [-2,147,483,648… 2,147,483,647]
//•	Third number will be in the range [-2,147,483,648… 2,147,483,647]
//•	Fourth number will be in the range [-2,147,483,648… 2,147,483,647]
public class IntegerOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long first = Long.parseLong(scanner.nextLine());
        long second = Long.parseLong(scanner.nextLine());
        long third = Long.parseLong(scanner.nextLine());
        long fourth = Long.parseLong(scanner.nextLine());
        long result = ((first + second)/third)*fourth;
        System.out.println(result   );
    }

}
