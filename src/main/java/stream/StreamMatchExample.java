package stream;
import java.util.Arrays;

public class StreamMatchExample {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};

        boolean allEven = Arrays.stream(numbers)
                .allMatch(num -> num % 2 == 0);
        System.out.println("Are all numbers even? " + allEven);
    }
}
