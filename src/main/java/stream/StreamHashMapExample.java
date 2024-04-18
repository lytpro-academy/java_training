package stream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamHashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Cherry");

        // Convert HashMap entries to a stream of key-value pairs and filter by value
        String result = map.entrySet()
                .stream()
                .filter(entry -> entry.getValue().startsWith("A"))
                .map(entry -> entry.getKey() + ":" + entry.getValue())
                .collect(Collectors.joining(", "));

        System.out.println("Filtered key-value pairs: " + result);
    }
}
