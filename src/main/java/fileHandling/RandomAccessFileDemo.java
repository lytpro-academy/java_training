package fileHandling;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile: This class allows reading and writing to a random access file. A random access file behaves like
 * a large array of bytes stored in the filesystem. The main difference between RandomAccessFile and other I/O classes
 * is that, while the others only allow you to read from start to end in sequence, RandomAccessFile lets you read or
 * write data anywhere in the file - it can seek to an arbitrary location for the next read or write operation.
 * Real-life use case: Can be used for tasks like holding a large amount of data for a computer game or other situation
 * where you're manipulating large arrays of bytes.
 * */
public class RandomAccessFileDemo {
    public static void main(String[] args) {
        try {
            RandomAccessFile file = new RandomAccessFile("example3.txt", "rw");
            file.writeUTF("RandomAccessFile example"); // Writing to the file

            // Resetting file pointer to the start of file
            file.seek(0);

            // Reading the data from the file
            String str = file.readUTF();
            System.out.println("Data in the file: " + str);
            file.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
