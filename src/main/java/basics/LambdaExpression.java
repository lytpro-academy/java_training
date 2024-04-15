package basics;

/***
 * Java 8 brought a powerful new syntactic improvement in the form of lambda expressions. A lambda is an anonymous
 * function that we can handle as a first-class language citizen. For instance, we can pass it to or return it
 * from a method.
 * Before Java 8, we would usually create a class for every case where we needed to encapsulate a single piece of
 * functionality. This implied a lot of unnecessary boilerplate code to define something that served as a primitive
 * function representation.
 * A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are
 * similar to methods, but they do not need a name and they can be implemented right in the body of a method.
 */
public class LambdaExpression {
    public static void main(String args[])
    {
        // lambda expression to create the object
        new Thread(() -> {
            System.out.println("New thread created");
        }).start();
    }
}
