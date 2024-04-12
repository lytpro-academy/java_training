package objects.equalsAndHashcode;

/**
 * The Person class overrides the equals() and hashCode() methods to compare two Person objects based on their name and age.
 * We create two Person objects person1 and person2 with the same name and age.
 * According to the contract:
 * person1.equals(person2) and person2.equals(person1) both return true.
 * person1.hashCode() and person2.hashCode() return the same hash code.
 * This demonstrates how the contract ensures consistency and correctness when objects are used in hash-based collections.
 * */
public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return 31 * name.hashCode() + age;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);

        // Equals method contract
        System.out.println("Equals method contract:");
        System.out.println("person1.equals(person2): " + person1.equals(person2)); // true
        System.out.println("person2.equals(person1): " + person2.equals(person1)); // true

        // Hash code contract
        System.out.println("\nHash code contract:");
        System.out.println("person1.hashCode(): " + person1.hashCode()); // Same hash code
        System.out.println("person2.hashCode(): " + person2.hashCode()); // Same hash code
    }
}
