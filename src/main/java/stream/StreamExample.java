package stream;

import java.util.Arrays;
import java.util.List;

/**
 * Java Stream is a new addition to the Java language starting from Java 8. It's a powerful and flexible way to process
 * collections of elements. Streams allow you to perform functional-style operations on sequences of elements (such as
 * lists or arrays) in a concise and expressive manner.
 *
 * Here's a breakdown of some key concepts:
 * Stream: A stream represents a sequence of elements and supports different kinds of operations to perform computations
 * upon those elements.
 * Intermediate Operations: These operations are used to process the stream and produce another stream as a result.
 * Examples include filter(), map(), sorted(), distinct(), etc.
 *
 * Terminal Operations: These operations are used to produce a result or a side-effect. Once a terminal operation is
 * performed, the stream is consumed and cannot be reused. Examples include forEach(), collect(), reduce(), count(), etc.
 *
 * Lazy Evaluation: Streams are lazily evaluated, meaning intermediate operations are only performed when a terminal
 * operation is invoked. This can lead to improved performance by avoiding unnecessary computations.
 *
 * Parallel Streams: Java also provides parallel streams which allow for concurrent execution of stream operations.
 * This can be useful for processing large data sets more efficiently on multi-core processors.
 * */
public class StreamExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie", "David", "Emma", "Frank");

        // Filter names starting with 'A' and convert them to uppercase
        names.stream().
                filter(name -> name.startsWith("A")).
                map(String::toUpperCase).
                forEach(System.out::println);

        // Count the number of names longer than 4 characters
        long count = names.stream().filter(name -> name.length() > 4).count();
        System.out.println("Number of names longer than 4 characters: " + count);
    }

}
