package basics;

/**
 * Main class contains the main method to demonstrate the usage of the Calculator class.
 */
public class Main {

    // Main method, entry point of the program
    public static void main(String[] args) {
        // Creating an instance of the Calculator class
        Calculator calculator = new Calculator();

        // Performing addition operation using the Calculator instance
        int result = calculator.add(5, 3);

        // Printing the result of the addition operation
        System.out.println("Result: " + result);
    }

}