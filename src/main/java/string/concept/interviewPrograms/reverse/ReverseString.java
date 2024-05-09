package string.concept.interviewPrograms.reverse;


/**
 * Time complexity: The StringBuilder.reverse() call reverses the string in O(n) time where n is the length of the
 * string, as it goes through every character once.
 * Space complexity: The StringBuilder stores a copy of the string internally, which takes O(n) space. So, the space
 * complexity is also O(n).
 * */
public class ReverseString {
    public static void main(String[] args) {
        String input = "Hello";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }
}
