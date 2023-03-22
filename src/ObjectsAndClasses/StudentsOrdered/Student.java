package ObjectsAndClasses.StudentsOrdered;

public class Student {
    public String firstName;
    public String lastName;
    public double grade;

    @Override
    public String toString() {
        return firstName + " " + lastName + ": " + grade;
    }

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

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }
}
