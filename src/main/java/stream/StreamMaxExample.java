package stream;
import java.util.Arrays;

public class StreamMaxExample {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 2, 10, 3};

        int maxNumber = Arrays.stream(numbers)
                .max()
                .orElseThrow();
        System.out.println("Maximum number: " + maxNumber);
    }
}
