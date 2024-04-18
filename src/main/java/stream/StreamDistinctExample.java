package stream;

import java.util.Arrays;
import java.util.List;

/**
 * flatMap is a powerful operation in Java Streams that performs a one-to-many transformation on the elements of a
 * stream. It takes each element of the stream and applies a function that returns another stream for each element.
 * Then, it flattens these streams of streams into a single stream of elements.
 *
 * It takes a Function as a parameter, which maps each element of the stream to another stream.
 * It applies this function to each element of the original stream.
 * It flattens the resulting streams into a single stream by concatenating them.
 * The main advantage of flatMap is that it allows you to work with nested collections more easily.
 * It's particularly useful when you have a collection of collections and want to process the individual
 * elements of the nested collections as if they were in a single collection.
 * */
public class StreamDistinctExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 5);

        numbers.stream()
                .distinct()
                .forEach(System.out::println);
    }
}
