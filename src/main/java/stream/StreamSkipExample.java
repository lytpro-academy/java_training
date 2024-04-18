package stream;
import java.util.Arrays;
import java.util.List;

public class StreamSkipExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank");

        names.stream()
                .skip(2)
                .forEach(System.out::println);
    }
}
