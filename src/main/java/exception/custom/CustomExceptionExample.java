package exception.custom;

public class CustomExceptionExample {

    // Method that throws custom exception
    public static void performTask(int value) throws CustomException {
        if (value < 0) {
            // Throw custom exception if the input value is negative
            throw new CustomException("Negative value not allowed");
        } else {
            // Otherwise, perform the task
            System.out.println("Task performed successfully with value: " + value);
        }
    }

    // Main method to demonstrate custom exception
    public static void main(String[] args) {
        try {
            // Calling the method that may throw custom exception
            performTask(10);
            performTask(-5); // This call will throw CustomException
        } catch (CustomException e) {
            // Handling the custom exception
            System.out.println("Custom Exception caught: " + e.getMessage());
        }
    }
}
