package ObjectsAndClasses.Students;

public class Student {
    public String firstName;
    public String lastName;
    public  int age;
    public String hometown;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    //"{firstName} {lastName} is {age} years old.".
    @Override
    public String toString() {
        return firstName + " " + lastName + " is " + age +  " years old.";
    }

}
