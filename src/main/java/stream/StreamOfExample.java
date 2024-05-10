package stream;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamOfExample {
    public static void main(String[] args) {
        List<String> list = Stream.of("a", "b", "c")
                .toList();

        boolean allMatch = Stream.of(2, 4, 6, 8, 10).allMatch(n -> n % 2 == 0);

        Optional<String> reduced = Stream.of("a", "b", "c")
                .reduce((s1, s2) -> s1 + "-" + s2);

        System.out.println(reduced.get());
    }
}
