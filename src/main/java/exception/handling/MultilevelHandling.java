package exception.handling;

public class MultilevelHandling {
    public static void main(String[] args) {
        int[] array = new int[5];
        String string = null;

        try {
            int element_at_index = array[10];  // This will throw an ArrayIndexOutOfBoundsException
            int lengthOfString = string.length();  // This will throw a NullPointerException
        }
        // Catch block handling multiple exceptions
        catch (ArrayIndexOutOfBoundsException | NullPointerException | ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}
