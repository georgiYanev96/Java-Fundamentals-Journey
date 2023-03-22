package ObjectsAndClasses.OpinionPoll;

import java.util.*;

//Using the Person class, write a program that reads from the console N lines of personal information
//and then prints all people whose age is more than 30 years, sorted in alphabetical order.
//Note: you can use stream() to filter people.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Person> personList = new ArrayList<>();
        while (n > 0){
            String[] input = scanner.nextLine().split(" ");
            if(Integer.parseInt(input[1]) > 30) {
                Person current = new Person();
                current.setName(input[0]);
                current.setAge(Integer.parseInt(input[1]));
                personList.add(current);
            }
            n--;
        }
        personList.sort(Comparator.comparing(Person::getName));
        personList.forEach(person -> System.out.println(person.toString()));
    }
}
