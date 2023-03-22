package ObjectsAndClasses.OpinionPoll;

public class Person {
    public String name;
    public int age;


    @Override
    public String toString() {
        return name + " - " + age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
