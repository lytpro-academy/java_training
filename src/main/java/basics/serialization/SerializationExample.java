package basics.serialization;
import java.io.*;

/**
 * We define a Person class that implements the Serializable interface. This allows instances of Person to be serialized.
 * We create an instance of Person and serialize it to a file named person.ser.
 * We then deserialize the object from the person.ser file and print it to the console.
 * */
public class SerializationExample {
    public static void main(String[] args) {
        // Create an instance of Person
        Person person = new Person("Alice", 30);

        // Serialize the object
        try (FileOutputStream fileOut = new FileOutputStream("person.ser");
             ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
            objectOut.writeObject(person);
            System.out.println("Serialized data is saved in person.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the object
        try (FileInputStream fileIn = new FileInputStream("person.ser");
             ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
            Person deserializedPerson = (Person) objectIn.readObject();
            System.out.println("Deserialized Person: " + deserializedPerson);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
