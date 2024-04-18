package stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        String uppercaseJoined = words.stream()
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));
        System.out.println("Uppercase joined string: " + uppercaseJoined);
    }
}
