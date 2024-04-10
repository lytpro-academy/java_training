package string.concept;

public class StringExample {
    public static void main(String args[]){
        String s1="Welcome";
        String s2="Welcome USA";

        String s3= new String("Welcome"); // occupying their memory address and space
        String s4=new String("Welcome");

        boolean s1EqualS2 = s1 == s2;
        System.out.println(s1EqualS2);

        boolean s3EqualS4 = s3 == s4;
        System.out.println(s3EqualS4);

        System.out.println(s3.equals(s4));
        System.out.println(s1.equalsIgnoreCase("welcome"));

        System.out.println(s2.compareTo("WelcomE"));

        System.out.println(s1.concat(" USA"));

        System.out.println(s2.substring(0,8));

        System.out.println(s2.toLowerCase());

    }
}

// There is String "Welcome USA" now print it in reverse order the Output should be "USA Welcome"
// There is String "Welcome USA" now print it in reverse order the Output should be "ASU emocleW"