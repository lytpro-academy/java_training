package designPatterns.creational.singleton;

public class Main {
    public static void main(String[] args) {
        // Get the singleton instance
        Singleton singleton = Singleton.getInstance();

        // Call a method on the singleton instance
        singleton.doSomething();
    }
}
