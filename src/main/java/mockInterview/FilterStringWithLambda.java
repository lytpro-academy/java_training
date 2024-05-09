package mockInterview;

import java.util.Arrays;
import java.util.List;

public class FilterStringWithLambda {

    public static void main(String[] args) {
        // Create an ArrayList of strings
        List<String> list = Arrays.asList("apple", "banana", "cherry","date","elderberry");

        // Use a lambda expression to filter the list of strings
        // This expression will filter out all strings that do not start with the letter "a"
        List<String> filteredList = list.stream()
                .filter(s -> s.startsWith("a"))
                .toList();

        // Print the filtered list
        filteredList.forEach(System.out::println);
    }
}

/**
 * The time complexity of this operation would be O(n), where n is the size of the list.
 * This is because the filter function needs to look at every string within the list once. The startsWith operation is
 * constant time (O(1)) per string, because it only needs to look at the first character of each string. However, as
 * this operation is performed for every string in the list, the overall time complexity is linear.
 *
 * The space complexity of this operation would also be O(n). This is because the filter operation in Java's Stream
 * API creates a new list after filtering (it does not filter in-place). In the worst case (all elements match the
 * filter), this will require enough space to hold all n items in the original list.
 * But please note that the space complexity can drop to less than O(n) if only a few items meet the filter condition,
 * as you only create a new list of the items that meet the condition.
 * But when we talk about complexities, we usually consider the worst-case scenario. So, both the time and space
 * complexities are O(n).
 * */