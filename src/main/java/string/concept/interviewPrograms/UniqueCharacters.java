package string.concept.interviewPrograms;

import java.util.HashSet;
import java.util.Set;

//Check if a String Contains Only Unique Characters:
public class UniqueCharacters {
    public static void main(String[] args) {
        String input = "abcde";
        boolean hasUniqueChars = checkUniqueCharacters(input);
        System.out.println(hasUniqueChars);
    }

    public static boolean checkUniqueCharacters(String str) {
        Set<Character> set = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!set.add(c)) {
                return false;
            }
        }
        return true;
    }
}
