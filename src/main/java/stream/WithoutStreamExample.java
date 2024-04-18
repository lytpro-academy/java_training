package stream;
import java.util.Arrays;
import java.util.List;

public class WithoutStreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank");

        // Filter names starting with 'A' and convert them to uppercase
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name.toUpperCase());
            }
        }

        // Count the number of names longer than 4 characters
        int count = 0;
        for (String name : names) {
            if (name.length() > 4) {
                count++;
            }
        }
        System.out.println("Number of names longer than 4 characters: " + count);
    }
}
