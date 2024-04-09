package exception.inheritance;

public class Subclass extends Superclass {
    // Overriding the method from superclass
    @Override
    public void readFile() throws java.io.FileNotFoundException {
        // Read file operation with potential FileNotFoundException
        throw new java.io.FileNotFoundException("FileNotFoundException occurred in Subclass");
    }

    // New method in subclass throwing a new checked exception
    public void writeToDatabase() throws java.sql.SQLException {
        // Write to database operation
        throw new java.sql.SQLException("SQLException occurred in Subclass");
    }
}
