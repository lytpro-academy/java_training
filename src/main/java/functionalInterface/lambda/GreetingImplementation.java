package functionalInterface.lambda;

public class GreetingImplementation {
    public static void main(String[] args) {
        // Traditional way
        Greeting greeting = new Greeting() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello, " + name);
            }
        };
        greeting.sayHello("John");

        // Using Lambda
        Greeting greetingLambda = (String name) -> {
            System.out.println("Hello, " + name);
        };
        greetingLambda.sayHello("Sarah");
    }
}
