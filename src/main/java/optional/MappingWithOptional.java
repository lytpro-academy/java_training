package optional;

import java.util.Optional;

public class MappingWithOptional {
    public static void main(String[] args) {
        Optional<String> maybeString = Optional.of("Hello");
        Optional<Integer> maybeLength = maybeString.map(String::length);
        maybeLength.ifPresent(System.out::println); // Prints the length if present
    }
}