package string.concept.interviewPrograms.reverse;

//Reverse a String with recursion
/**
 * Time complexity: The function calls itself recursively for each character of the string. It also creates a new
 * string in every recursion with str.substring(1) + str.charAt(0). Both the substring operation and concatenation
 * are O(n) operations, this gives us a time complexity of O(n^2).
 *
 * Space complexity: As for the space, an additional string is created at each recursive step. In the worst case
 * scenario (if the input string has n characters), this results in O(n^2) space complexity. Also, for deep recursion,
 * there will be n nested calls, so it uses O(n) space on the call stack.
 * */
public class ReverseStringRecursion {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }
                                        // elloH
    public static String reverseString(String str) {
        // Base case: if the string is empty or has only one character, return it
        if (str.isEmpty() || str.length() == 1) {
            return str;
        }

        // Recursive call: reverse the substring from index 1 to the end,
        // and append the first character to the result
        return reverseString(str.substring(1)) + str.charAt(0);
    }
}
