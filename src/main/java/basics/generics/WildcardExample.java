package basics.generics;

import java.util.List;

public class WildcardExample {
    public static void main(String[] args) {
        // Create a box for fruits
        Food<Fruit> fruitBox = new Food<>();
        Food<Apple> appleBox = new Food<>();
        Food<Banana> bananaBox = new Food<>();

        // Add apples and bananas to the box
        fruitBox.addFruit(new Apple("Red Apple"));
        fruitBox.addFruit(new Banana("Yellow Banana"));

        // Get all fruits from the box and print their names
        List<Fruit> fruits = fruitBox.getFruits();
        for (Fruit fruit : fruits) {
            System.out.println("Fruit: " + fruit.getName());
        }
    }
}
