package string.concept.toString;

// DB Table with name Person
// Entity class
public class Person {
    private String name;
    private int age;
    private String occupation;

    // Constructor
    public Person(String name, int age, String occupation) {
        this.name = name;
        this.age = age;
        this.occupation = occupation;
    }

    // Getter methods

    @Override
    public String toString() {
        return "name " + name + " age " + age + " occupation " + occupation;
    }
}