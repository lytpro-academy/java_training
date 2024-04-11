package string.concept.interviewPrograms;

//Check if a String Contains Only Digits:
public class OnlyDigits {

    public static void main(String[] args) {
        String input = "12345";
        boolean containsOnlyDigits = checkDigits(input);
        System.out.println(containsOnlyDigits);
    }

    public static boolean checkDigits(String str) {
        return str.matches("[0-9]+");
    }

}
