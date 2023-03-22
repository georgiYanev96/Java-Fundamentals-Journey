package ObjectsAndClasses.StudentsOrdered;

import ObjectsAndClasses.OpinionPoll.Person;

import java.util.*;

//Write a program that receives n count of students and orders them by grade (in descending).
//Each student should have first name (string), last name (string) and grade (floating-point number).
//Input
//•	First line will be a number n
//•	Next n lines you will get a student info in the format "{first name} {second name} {grade}"
//Output
//•	Print each student in the following format "{first name} {second name}: {grade}"
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        List<Student> myStudents = new ArrayList<>();
        while (n > 0){
            String[] command = scanner.nextLine().split(" ");
            Student current = new Student();
            current.setFirstName(command[0]);;
            current.setLastName(command[1]);
            current.setGrade(Double.parseDouble(command[2]));
            myStudents.add(current);
            n--;
        }
        Collections.sort(myStudents, (s1, s2) -> Double.compare(s2.getGrade(), s1.getGrade()));
        myStudents.forEach(person -> System.out.println(person.toString()));
    }
}
