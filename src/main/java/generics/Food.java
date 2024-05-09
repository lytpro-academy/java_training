package generics;

import java.util.ArrayList;
import java.util.List;

// A generic class that can work with any subtype of Fruit
class Food<T extends Fruit> {
    private List<T> fruits;

    // Constructor
    public Food() {
        this.fruits = new ArrayList<>();
    }

    // Add fruit to the box
    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    // Get all fruits in the box
    public List<T> getFruits() {
        return fruits;
    }
}