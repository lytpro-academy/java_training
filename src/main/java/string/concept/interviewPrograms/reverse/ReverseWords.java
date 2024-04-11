package string.concept.interviewPrograms.reverse;

// Reverse words of a String
// Input example: "Hello USA"
// Output: USA Hello
public class ReverseWords {
    public static void main(String[] args) {
        String input = "Hello USA";
        String reversed = reverseWords(input);
        System.out.println(reversed);
    }

    public static String reverseWords(String str) {
        // Split the input string by space into an array of words
        String[] words = str.split(" ");

        // Create a StringBuilder to store the reversed string
        StringBuilder reversedBuilder = new StringBuilder();

        // Iterate through the words array in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            // Append each word to the StringBuilder followed by a space
            reversedBuilder.append(words[i]);
            reversedBuilder.append(" ");
        }

        // Convert the StringBuilder to a string and remove trailing space
        String reversed = reversedBuilder.toString().trim();

        return reversed;
    }
}
