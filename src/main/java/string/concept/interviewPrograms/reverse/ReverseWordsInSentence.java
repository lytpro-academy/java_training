package string.concept.interviewPrograms.reverse;

/**
 * Reverse the sentence and then its words
 * Input: "Hello USA"
 * Output: ASU olleH
 */
public class ReverseWordsInSentence {

    public static void main(String[] args) {
        String input = "Hello USA";
        String reversed = reverseString(input);
        System.out.println(reversed);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            // Swap characters at left and right indices
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move towards the center
            left++;
            right--;
        }

        // Convert character array to string
        return new String(charArray);
    }
}
