package fileHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFileExample {
    public static void main(String[] args) {
        try {
            // Specify the file path
            BufferedReader reader = new BufferedReader(new FileReader("example.txt"));

            // Read data from the file
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            // Close the reader
            reader.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}