package fileHandling;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStream: It is an output stream for writing data to a File or to a FileDescriptor.
 * Real-life use case: Writing data to a file on disk.
 * */
public class FileOutputStreamDemo {
    public static void main(String args[]) throws IOException {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("example2.txt");
            String s = "Output stream example";
            byte b[] = s.getBytes(); // converting string into byte array
            fos.write(b);
            System.out.println("Writing to file completed");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                fos.close();
            }
        }
    }
}