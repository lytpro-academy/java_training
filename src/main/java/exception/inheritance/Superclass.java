package exception.inheritance;

public class Superclass {
    // Method throwing IOException
    public void readFile() throws java.io.IOException {
        // Read file operation
        throw new java.io.IOException("IOException occurred in Superclass");
    }
}
