package stream;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamFindFirstExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank");

        Optional<String> firstElement = names.stream()
                .findFirst();
        System.out.println("First element: " + firstElement.orElse("List is empty"));
    }
}
