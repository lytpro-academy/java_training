package string.concept.interviewPrograms.reverse;

public class ReverseUtil {

    // Try to use this util method wherever possible while solving different problems
    // related to reversing a string
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
