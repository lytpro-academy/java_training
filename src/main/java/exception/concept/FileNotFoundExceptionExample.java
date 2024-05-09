package exception.concept;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileNotFoundExceptionExample {

    public void getFileDetails() throws FileNotFoundException {
        File file = new File("sdsd");
        FileReader reader = new FileReader(file);
    }

    public void readFile() {
        try {
            getFileDetails();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
