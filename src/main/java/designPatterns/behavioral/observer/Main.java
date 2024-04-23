package designPatterns.behavioral.observer;

/**
 *Behavioral design patterns are concerned with how objects communicate and interact with each other.
 * They focus on the assignment of responsibilities between objects and encapsulating behavior in objects.
 *
 * These patterns deal with algorithms, communication, and the assignment of responsibilities between objects.
 * They aim to increase flexibility in carrying out communication and responsibilities among objects.
 *
 * These patterns provide solutions for different types of communication and interaction between objects in a system,
 * allowing for more flexible, reusable, and maintainable software designs.
 *
 * In this example, Subject is an interface defining methods to attach, detach, and notify observers. ConcreteSubject
 * is a concrete implementation of the Subject interface. Observer is an interface defining the update method, and
 * ConcreteObserver is a concrete implementation of the Observer interface. When the state of the ConcreteSubject
 * changes, it notifies all its observers, and each observer updates itself accordingly.
 * */
public class Main {
    public static void main(String[] args) {
        // Create a subject
        ConcreteSubject subject = new ConcreteSubject();

        // Create observers and attach them to the subject
        ConcreteObserver observer1 = new ConcreteObserver(subject);
        ConcreteObserver observer2 = new ConcreteObserver(subject);

        // Change the state of the subject
        subject.setState(5);
    }
}
