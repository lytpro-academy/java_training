package designPatterns.creational.factory;

// Concrete Creators
class ConcreteCreator1 implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
