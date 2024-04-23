package designPatterns.structural.decorator;


/**
 * The Decorator design pattern is a structural pattern that allows behavior to be added to individual objects
 * dynamically, without affecting the behavior of other objects from the same class. It is used to extend or
 * modify the functionality of objects at runtime by wrapping them in an object of a decorator class.
 *
 * This pattern is commonly used in GUI frameworks for adding borders, scrollbars, or other decorations to components,
 * as well as in I/O streams for adding additional functionality such as buffering or encryption.
 *
 * In this example, Coffee is the component interface defining the methods for coffee objects. SimpleCoffee is a
 * concrete implementation of the Coffee interface. CoffeeDecorator is an abstract class implementing the Coffee
 * interface as well, acting as a base for concrete decorators (MilkDecorator and SugarDecorator). Each decorator
 * adds its own behavior (cost and ingredients) to the coffee object it decorates, without modifying the behavior of
 * other decorators.
 * */
public class Main {
    public static void main(String[] args) {
        // Create a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.cost() + ", Ingredients: " + coffee.ingredients());

        // Decorate the simple coffee with milk
        coffee = new MilkDecorator(coffee);
        System.out.println("Cost: $" + coffee.cost() + ", Ingredients: " + coffee.ingredients());

        // Decorate the coffee with sugar
        coffee = new SugarDecorator(coffee);
        System.out.println("Cost: $" + coffee.cost() + ", Ingredients: " + coffee.ingredients());
    }

}
