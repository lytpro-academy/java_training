package fileHandling;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream: It is an input stream for reading data from a File or from a FileDescriptor.
 * FileInputStream is meant for reading streams of raw bytes such as image data.
 * Real-life use case: Reading data from a file on disk.
 * */
public class FileInputStreamDemo {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("example2.txt");
            int i;
            while ((i = fis.read()) != -1)
                System.out.print((char) i);
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}