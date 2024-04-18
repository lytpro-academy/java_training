package stream;
import java.util.Arrays;
import java.util.List;

public class StreamLimitExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank");

        names.stream()
                .limit(3)
                .forEach(System.out::println);
    }
}
