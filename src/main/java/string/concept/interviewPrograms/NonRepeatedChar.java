package string.concept.interviewPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

//Find the First Non-Repeated Character in a String:
public class NonRepeatedChar {

    public static void main(String[] args) {
        String input = "stress";
        String result = findNonRepeatedChars(input);
        System.out.println(result);
    }

    public static String findNonRepeatedChars(String str) {
        Map<Character, Integer> charCountMap = new LinkedHashMap<>();

        // Count the occurrence of each character
        for (char c : str.toCharArray()) {
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        // Build the result string with non-repeated characters
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (charCountMap.get(c) == 1) {
                sb.append(c);
            }
        }

        return sb.toString();
    }
}
