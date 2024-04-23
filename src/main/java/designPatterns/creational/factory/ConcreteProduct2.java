package designPatterns.creational.factory;

/**
 * The Factory Method pattern defines an interface for creating an object, but allows subclasses to alter the type of
 * objects that will be created. It provides a way to delegate the instantiation logic to subclasses.
 *
 * The Factory Method pattern is commonly used in frameworks where the exact types of objects are not known in advance
 * and need to be determined at runtime, such as GUI frameworks for creating UI components or in game development for
 * creating different types of game characters.
 * */
class ConcreteProduct2 implements Product {
    @Override
    public void operation() {
        System.out.println("Operation performed by ConcreteProduct2");
    }
}
