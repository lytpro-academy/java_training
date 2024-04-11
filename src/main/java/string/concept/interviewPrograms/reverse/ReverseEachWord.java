package string.concept.interviewPrograms.reverse;

/**
 * Reverse each word of a String
 * Input: "Hello World"
 * Output: "olleH dlroW"
 * */
public class ReverseEachWord {

    public static void main(String[] args) {
        String input = "Hello World";
        String reversed = reverseEachWord(input);
        System.out.println(reversed);
    }

    public static String reverseEachWord(String str) {
        String[] words = str.split("\\s+"); // Split the string by space
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            // Reverse each word and append to result
            result.append(reverseString(word)).append(" ");
        }

        return result.toString().trim(); // Remove trailing space
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
