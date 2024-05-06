package basics.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsExample {
    public static void main(String[] args) {
        // Create a Box for Integer
        Box<Integer> intBox = new Box<>(10);
        System.out.println("Integer value: " + intBox.getValue());

        // Create a Box for String
        Box<String> strBox = new Box<>("Hello");
        System.out.println("String value: " + strBox.getValue());

        // Create a list of Strings using generics
        List<String> stringList = new ArrayList<>();
        stringList.add("Apple");
        stringList.add("Banana");
        stringList.add("Orange");

        // Iterate through the list
        for (String fruit : stringList) {
            System.out.println("Fruit: " + fruit);
        }
    }
}
