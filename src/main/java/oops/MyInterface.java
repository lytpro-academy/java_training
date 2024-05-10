package oops;

interface MyInterface {
    // Regular method declaration
    void regularMethod();

    // Default method with implementation
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
}
