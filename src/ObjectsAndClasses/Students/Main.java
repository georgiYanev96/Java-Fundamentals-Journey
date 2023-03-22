package ObjectsAndClasses.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Define a class Student, which holds the following information about students: first name, last name, age and hometown.
//Read list of students until you receive "end" command. After that, you will receive a city name.
//Print only students which are from the given city, in the following format: "{firstName} {lastName} is {age} years old.".
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean toContinue = true;
        List<Student> myStudents = new ArrayList<>();
        while (toContinue){
            String[] command = scanner.nextLine().split(" ");
            if(command[0].equals("end")){
                toContinue = false;
                break;
            }
            Student current = new Student();
            current.setFirstName(command[0]);
            current.setLastName(command[1]);
            current.setAge(Integer.parseInt(command[2]));
            current.setHometown(command[3]);
            myStudents.add(current);
        }
        String hometown = scanner.nextLine();
        for (int i = 0; i < myStudents.size(); i++) {
            if(myStudents.get(i).getHometown().equals(hometown)){
                System.out.println(myStudents.get(i).toString());
            }
        }
    }
}
