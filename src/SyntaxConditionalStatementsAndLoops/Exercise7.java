package SyntaxConditionalStatementsAndLoops;
//Write a program, which prints all the numbers from 1 to 100, which are divisible by 3.
// You have to use a single for loop. The program should not receive input.
public class Exercise7 {
    public static void main(String[] args) {
        for (int i = 0; i <= 100 ; i++) {
            if(i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
