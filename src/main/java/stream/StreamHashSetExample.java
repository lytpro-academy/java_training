package stream;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        // Filter elements starting with 'A' and collect them into a new set
        Set<String> filteredSet = set.stream()
                .filter(s -> s.startsWith("A"))
                .collect(Collectors.toSet());

        System.out.println("Filtered set: " + filteredSet);
    }
}
