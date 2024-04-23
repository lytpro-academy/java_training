package designPatterns.creational.factory;

class ConcreteCreator2 implements Creator {
    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}