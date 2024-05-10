package stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * reduce is a terminal operation that performs a reduction on the elements of the stream.
 * It takes a BinaryOperator as a parameter, which is a functional interface that takes two parameters and returns a
 * single value. In this case, we're using a lambda that multiplies two integers together.
 * The result of the reduce operation is an Optional object. This is because the reduce method can't return a result
 * if the stream is empty.
 * Finally, we're using ifPresent to print the result if the Optional is not empty. We can assume this code will print
 * an output because our list is not empty. If the list was empty, reduce would result in an empty Optional,
 * and ifPresent wouldn't execute its argument.
 * */
public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        Optional<Integer> product = numbers.stream()
                .reduce((num1, num2) -> num1 * num2);

        product.ifPresent(System.out::println); // prints "120", which is 1*2*3*4*5
    }
}
