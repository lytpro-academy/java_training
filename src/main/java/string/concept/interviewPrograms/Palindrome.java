package string.concept.interviewPrograms;

//Check if a String is a Palindrome
public class Palindrome {
    public static void main(String[] args) {
        String input = "radar";
        boolean isPalindrome = isPalindrome(input);
        System.out.println(isPalindrome);
    }

    public static boolean isPalindrome(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
