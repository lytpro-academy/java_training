package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamSumExample {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,6,5,7,8,9);
        long count = list.stream()
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(count);
    }
}
