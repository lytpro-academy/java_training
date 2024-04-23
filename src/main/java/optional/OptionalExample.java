package optional;
import java.util.Optional;

/**
 * In Java, the Optional class is used to represent an object that may or may not contain a non-null value. It helps
 * to handle situations where a method might return a null value, avoiding NullPointerExceptions and making the code
 * more robust. Here's a basic example of how Optional can be used:
 * */
public class OptionalExample {
    public static void main(String[] args) {
        // Creating an Optional with a non-null value
        Optional<String> optionalString = Optional.of("Hello, world!");

        // Printing the value if present
        optionalString.ifPresent(System.out::println);

        // Creating an Optional with a potentially null value
        String nullableString = null;
        Optional<String> optionalNullableString = Optional.ofNullable(nullableString);

        // Printing the value if present, otherwise printing a default value
        System.out.println(optionalNullableString.orElse("Default Value"));

        // Using map to apply a function to the value if present
        Optional<Integer> optionalLength = optionalString.map(String::length);
        optionalLength.ifPresent(System.out::println);

        // Chaining multiple operations with map and flatMap
        Optional<String> upperCaseOptional = optionalString.map(String::toUpperCase);
        Optional<String> result = upperCaseOptional.flatMap(s -> Optional.of(s + "!!!"));
        result.ifPresent(System.out::println);
    }
}
