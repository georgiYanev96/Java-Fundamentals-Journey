package DataTypesАndVariables;

import java.util.Scanner;

//Calculate how many courses will be needed to elevate n persons by using an elevator with capacity of p persons.
//The input holds two lines: the number of people n and the capacity p of the elevator.
public class Elevator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int people = Integer.parseInt(scanner.nextLine());
        int capacity = Integer.parseInt(scanner.nextLine());
        int surplus = people % capacity;
        int courses = people / capacity;
        if(surplus != 0){
            courses +=1;
            System.out.println(courses);
        }else{
            System.out.println(courses);
        }
    }
}
