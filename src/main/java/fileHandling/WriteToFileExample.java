package fileHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class WriteToFileExample {
    public static void main(String[] args) {
        PrintWriter writer = null;
        try {
            // Specify the file path
            FileWriter fileWriter = new FileWriter("example.txt");
            writer = new PrintWriter(fileWriter);

            // Write data to the file
            writer.println("Hello, World!");
            writer.println("This is a Java file handling example.");

            System.out.println("Data has been written to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
            // Close the writer
            writer.close();
        }
    }
}