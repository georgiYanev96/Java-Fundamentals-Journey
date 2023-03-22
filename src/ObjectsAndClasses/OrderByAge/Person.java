package ObjectsAndClasses.OrderByAge;

public class Person {
    public String name;
    public int ID;
    public int age;
//Stefan with ID: 524244 is 10 years old.
    @Override
    public String toString() {
        StringBuilder output = new StringBuilder();
        output.append(name).append(" with ID: 524244").append(ID).append(" is ").append(age).append(" years old.");
        return output.toString();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
