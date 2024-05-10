package fileHandling;

import java.io.File;

public class CountFiles {

    public static void main(String[] args) {
        File file = new File("C:\\Users\\rbrav\\Docs\\PTL\\interview_questions"); // Replace with your directory
        System.out.println("Total files: " + countFiles(file));
    }

    public static long countFiles(File file) {
        long count = 0;

        // Get all files (including directories) in the current directory
        File[] files = file.listFiles();

        if (files != null) { // Ensure the directory is not empty
            for (File f : files) {
                if (f.isDirectory()) {
                    count += countFiles(f); // Recurse into subdirectory
                } else {
                    count++;
                }
            }
        }

        return count;
    }
}