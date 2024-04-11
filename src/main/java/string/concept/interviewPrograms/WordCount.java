package string.concept.interviewPrograms;

//Count the Number of Words in a String:
public class WordCount {
    public static void main(String[] args) {
        String input = "Hello World";
        int wordCount = countWords(input);
        System.out.println(wordCount);
    }

    public static int countWords(String str) {
        String[] words = str.split("\\s+");
        return words.length;
    }
}
