package optional;
import java.util.Optional;

public class OptionalAsParameter {
    public static void process(Optional<String> input) {
        input.ifPresent(System.out::println); // Process input if present
    }

    public static void main(String[] args) {
        Optional<String> data = Optional.of("Data to process");
        process(data);
    }
}