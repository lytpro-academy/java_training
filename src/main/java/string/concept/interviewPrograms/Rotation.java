package string.concept.interviewPrograms;

/**
 * Check if a String is a Rotation of Another String
 * */
public class Rotation {

    public static void main(String[] args) {
        String str1 = "abcd";
        String str2 = "cdab";
        boolean isRotation = checkRotation(str1, str2);
        System.out.println(isRotation);
    }

    public static boolean checkRotation(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        String concatenated = str1 + str1;
        return concatenated.contains(str2);
    }
}
