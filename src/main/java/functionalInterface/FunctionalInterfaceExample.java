package functionalInterface;

/**
 * A functional interface is an interface that contains only one abstract method. They can have only one functionality
 * to exhibit. From Java 8 onwards, lambda expressions can be used to represent the instance of a functional interface.
 * A functional interface can have any number of default methods. Runnable, ActionListener, and Comparable are some of
 * the examples of functional interfaces.
 *
 * Functional Interface is additionally recognized as Single Abstract Method Interfaces. In short, they are also known
 * as SAM interfaces. Functional interfaces in Java are the new feature that provides users with the approach
 * of fundamental programming.
 * */
public class FunctionalInterfaceExample {
    public static void main(String args[])
    {
        int a = 5;

        // lambda expression to define the calculate method
        Square s = (int x) -> x * x;

        // parameter passed and return type must be
        // same as defined in the prototype
        int ans = s.calculate(a);
        System.out.println(ans);
    }
}
