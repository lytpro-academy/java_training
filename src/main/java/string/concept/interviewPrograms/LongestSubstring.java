package string.concept.interviewPrograms;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int length = lengthOfLongestSubstring(input);
        System.out.println(length);
    }

    public static int lengthOfLongestSubstring(String str) {
        Set<Character> set = new HashSet<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;
        while (right < str.length()) {
            if (!set.contains(str.charAt(right))) {
                set.add(str.charAt(right));
                right++;
                maxLength = Math.max(maxLength, set.size());
            } else {
                set.remove(str.charAt(left));
                left++;
            }
        }
        return maxLength;
    }
}
