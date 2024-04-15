package basics;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

/**
 * CalculatorTest class contains unit tests for the Calculator class.
 */
class CalculatorFunctionalInterfaceExample {
    // Instance variable to hold an instance of Calculator
    private static Calculator calculator = new Calculator();

    // Test method to verify the add() method of the Calculator class
    @Test
    void add() {
        // Calling the add() method of Calculator and verifying the result
        int result = calculator.add(3, 4);
        assertEquals(7, result, "3 + 4 should equal 7");
    }

    // Test method to verify exception handling in the Calculator class (disabled for now)
    @Test
    @Disabled
    public void whenExceptionThrown_thenAssertionSucceeds() {
        // Verifying an expected exception using assertThrows
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });

        // Verifying the exception message
        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}
