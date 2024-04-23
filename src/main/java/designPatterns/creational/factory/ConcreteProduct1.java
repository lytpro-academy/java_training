package designPatterns.creational.factory;

// Concrete Products
class ConcreteProduct1 implements Product {
    @Override
    public void operation() {
        System.out.println("Operation performed by ConcreteProduct1");
    }
}
