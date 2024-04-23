package enums;

/**
 * Enums, short for Enumerations, are a special type in Java used to define collections of constants.
 * They provide a way to represent a fixed set of predefined values, making your code more readable, maintainable, and
 * less error-prone. Here's why we use enums and some example use cases along with programs:
 *
 * Why use Enums?
 * Readability: Enums improve the readability of your code by providing meaningful names for constants.
 * Type Safety: Enums are type-safe, meaning you can only assign predefined values to variables of enum type.
 * Maintainability: Since enums define a fixed set of values, they make your code easier to maintain and update.
 * Preventing Magic Numbers: Enums help in avoiding the use of "magic numbers" (hard-coded integer or string constants)
 * in your code.
 * */
public class PlanetEnumExample {

    public static void main(String[] args) {
        Planet earth = Planet.EARTH;
        System.out.println("Earth's mass relative to Earth: " + earth.getMassRelativeToEarth());

        Planet jupiter = Planet.JUPITER;
        System.out.println("Jupiter's mass relative to Earth: " + jupiter.getMassRelativeToEarth());
    }
}
