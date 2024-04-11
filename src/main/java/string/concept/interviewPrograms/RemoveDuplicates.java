package string.concept.interviewPrograms;

import java.util.LinkedHashSet;
import java.util.Set;

//Remove Duplicate Characters from a String:
public class RemoveDuplicates {

    public static void main(String[] args) {
        String input = "Hello";
        String result = removeDuplicates(input);
        System.out.println(result);
    }

    public static String removeDuplicates(String str) {
        Set<Character> set = new LinkedHashSet<>();
        for (char c : str.toCharArray()) {
            set.add(c);
        }
        StringBuilder sb = new StringBuilder();
        for (Character c : set) {
            sb.append(c);
        }
        return sb.toString();
    }

}
