package serialization;

import java.io.*;

// A class that implements Serializable
class Person implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private transient int id;
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters (not necessary for serialization)

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

/**
 * The transient keyword in Java is used to indicate that a field should not be serialized as part of its enclosing
 * object's serialization.
 * When an object is serialized, it is transformed into a sequence of bytes that can be written to a file or
 * transmitted over a network. When the object is deserialized, it is restored to its original state. If you have
 * fields in your class that are useful in your program but don't need to be persisted or transmitted, you can mark
 * them as transient and they won't be included in the serialization process. They will be ignored.
 * */


/**
 * In Java, serialVersionUID is a unique identifier for each serializable class. It is used during the deserialization
 * process to ensure that a loaded class is compatible with the serialized object. If no matching serialVersionUID is
 * found during deserialization, an InvalidClassException is thrown.
 * The serialVersionUID can either be declared explicitly by the programmer in the class or if not provided, it is
 * automatically generated by the Java Virtual Machine (JVM) at runtime based on various parameters associated with
 * the class.
 * */