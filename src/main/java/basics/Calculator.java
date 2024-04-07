package basics;

/**
 * Calculator class provides basic arithmetic operations such as addition, subtraction,
 * multiplication, and division.
 */
public class Calculator {

    // Method to add two integers
    public int add(int a, int b) throws RuntimeException {
        return a + b;
    }

    // Method to subtract one integer from another
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method to multiply two integers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Method to divide one integer by another
    public int divide(int a, int b) {
        // Check if divisor is zero, throw an exception if so
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }
}
