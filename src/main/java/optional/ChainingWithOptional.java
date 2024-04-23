package optional;

import java.util.Optional;

public class ChainingWithOptional {
    public static void main(String[] args) {
        Optional<String> maybeString = Optional.of("Hello");
        Optional<String> upperCase = maybeString.map(String::toUpperCase);
        Optional<String> result = upperCase.flatMap(s -> Optional.of(s + " World"));
        result.ifPresent(System.out::println); // Prints "HELLO WORLD"
    }
}
