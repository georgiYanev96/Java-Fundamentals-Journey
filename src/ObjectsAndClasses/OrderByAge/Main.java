package ObjectsAndClasses.OrderByAge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//You will receive an unknown number of lines. On each line, you will receive an array with 3 elements.
//The first element will be string and represents the name of the person.
//The second element will be a string and will represent the ID of the person.
//The last element will be an integer which represents the age of the person.
//When you receive the command "End", stop taking input and print all the people, ordered by age.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> myPersonsList = new ArrayList<>();
        boolean toContinue = true;
        while (toContinue){
            String[] input = scanner.nextLine().split(" ");
            if(input[0].equals("End")){
                toContinue = false;
                break;
            }
            Person current = new Person();
            current.setName(input[0]);
            current.setID(Integer.parseInt(input[1]));
            current.setAge(Integer.parseInt(input[2]));
            myPersonsList.add(current);
        }
        Collections.sort(myPersonsList, (p1, p2) -> Double.compare(p1.getAge(), p2.getAge()));
        myPersonsList.forEach(person -> System.out.println(person.toString()));
    }
}
