package optional;

import java.util.Optional;

public class DefaultValueWithOptional {
    public static void main(String[] args) {
        Optional<String> maybeString = Optional.empty();
        String result = maybeString.orElse("Default Value");
        System.out.println(result); // Prints "Default Value"
    }
}
