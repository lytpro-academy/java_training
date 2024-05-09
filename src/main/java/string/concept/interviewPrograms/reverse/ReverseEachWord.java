package string.concept.interviewPrograms.reverse;

/**
 * Reverse each word of a String
 * Input: "Hello World"
 * Output: "olleH dlroW"
 *
 *
 * Time complexity: The function reverses the string in-place by swapping characters. Since it always swaps two
 * characters at a time and iterates until the 'left' and 'right' pointers meet in the middle, the time complexity
 * of this function is O(n/2) which simplifies to O(n).
 *
 * Space complexity: The function uses a constant amount of space to store the temporary variable and the pointers,
 * in addition to the space used to store the character array (which is O(n)). The total space complexity is
 * therefore O(n) + O(1) = O(n).
 * */
public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseEachWord(input);
        System.out.println(reversed);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split("\\s+"); // {"Hello", "World"}
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append to result
            result.append(reverseString(word)).append(" ");
        }

        return result.toString().trim(); // Remove trailing space
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray(); // {'H', 'e'...'o'}
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            //  H
            char temp = charArray[left];
            // H = O
            charArray[left] = charArray[right];
            // 0 = H
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        // Convert character array to string
        return new String(charArray);
    }

}
