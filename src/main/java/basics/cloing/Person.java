package basics.cloing;

/**
 * In this implementation, Person implements Cloneable and overrides the clone() method
 * to create a deep copy. The clone() method of Person invokes the clone() method of
 * the Address class to perform a deep copy of the nested Address object.
 * */
public class Person implements Cloneable {
    private String name;
    private Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        // Shallow copy of Person object
        Person clonedPerson = (Person) super.clone();
        // Deep copy of nested Address object
        clonedPerson.address = (Address) address.clone();
        return clonedPerson;
    }
}
