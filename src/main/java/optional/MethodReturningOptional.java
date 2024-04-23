package optional;
import java.util.Optional;


public class MethodReturningOptional {
    public static Optional<String> findElementById(int id) {
        // Simulated method to find an element by ID
        if (id == 1) {
            return Optional.of("Element found");
        } else {
            return Optional.empty(); // Element not found
        }
    }

    public static void main(String[] args) {
        int searchId = 1;
        Optional<String> result = findElementById(searchId);
        result.ifPresent(System.out::println); // Print if result is present
    }
}
