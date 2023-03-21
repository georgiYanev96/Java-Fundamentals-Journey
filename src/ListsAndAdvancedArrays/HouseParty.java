package ListsAndAdvancedArrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Write a program that keeps track of the guests that are going to a house party.
//On the first input line you are going to receive how many commands you are going to have.
//On the next lines you are going to receive some of the following inputs:
//-	"{name} is going!"
//-	"{name} is not going!"
//If you receive the first type of input, you have to add the person if he/she is not in the list.
//(If he/she is in the list print on the console: "{name} is already in the list!").
//If you receive the second type of input, you have to remove the person if he/she is in the list.
//(If not print: "{name} is not in the list!"). At the end print all guests.
public class HouseParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<String> guestsList = new ArrayList<>();
        while (n>0){
            String input = scanner.nextLine();
            if(input.contains(" is going!")){
                String[] currentGuest = input.split(" ");
                if(!guestsList.contains(currentGuest[0])){
                    guestsList.add(currentGuest[0]);
                }else{
                    System.out.printf("%s is already in the list!%n", currentGuest[0]);
                }
            }
            if(input.contains(" is not going!")){
                String[] currentGuest = input.split(" ");
                if(guestsList.contains(currentGuest[0])){
                    guestsList.remove(currentGuest[0]);
                }else{
                    System.out.printf("%s is not in the list!%n",currentGuest[0]);
                }
            }
            n--;
        }
        for (int i = 0; i < guestsList.size(); i++) {
            System.out.println(guestsList.get(i));
        }
    }

}
