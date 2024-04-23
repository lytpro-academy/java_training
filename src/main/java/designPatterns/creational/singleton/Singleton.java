package designPatterns.creational.singleton;

/**
 * The Singleton design pattern ensures that a class has only one instance and provides a global point of access to
 * that instance. It belongs to the creational design patterns category, as it deals with object creation mechanisms,
 * specifically focusing on how to ensure that only one instance of a class is created.
 *
 * Key characteristics of the Singleton pattern include:
 * Single Instance: The Singleton class is responsible for creating and managing its own unique instance.
 * Global Access: The Singleton instance is globally accessible, meaning that any part of the program can access it
 * without needing to create its own instance.
 * Lazy Initialization: The Singleton instance is created only when it is first requested, rather than at the time the
 * class is loaded.
 *
 * Thread Safety: In multi-threaded environments, special care must be taken to ensure that the Singleton instance is
 * created safely and that no race conditions occur.
 * Singletons are often used in scenarios where there is a need for a single, shared resource, such as database
 * connections, thread pools, configuration settings, and logging systems.
 * */
public class Singleton {
    // Private volatile variable to hold the single instance of the class
    private static volatile Singleton instance;

    // Private constructor to prevent instantiation from outside
    private Singleton() {}

    // Static method to get the single instance of the class
    public static Singleton getInstance() {
        // Double-checked locking
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    // Other methods of the class
    public void doSomething() {
        System.out.println("Singleton instance is doing something.");
    }
}
