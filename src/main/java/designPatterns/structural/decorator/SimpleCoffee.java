package designPatterns.structural.decorator;

// Concrete component
class SimpleCoffee implements Coffee {
    @Override
    public double cost() {
        return 1.0;
    }

    @Override
    public String ingredients() {
        return "Coffee";
    }
}

