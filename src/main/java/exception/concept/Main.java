package exception.concept;

/**
 * Exception is an abnormal condition. In Java, an exception is an event that disrupts the normal flow of the program.
 * It is an object which is thrown at runtime.
 * */
public class Main {
    private  int number = 10;

    public static void main(String[] args) {
        System.out.println("Hello USA");
            int j=0;
        try {
            System.out.println("Inside try block before exception");
            int i = 10/j;
            System.out.println("Inside try block after exception");
        }
        catch (ArithmeticException ex){
            System.out.println("Inside catch block after exception");
            ex.printStackTrace();
        }

        System.out.println("Hello DE");
    }

}
