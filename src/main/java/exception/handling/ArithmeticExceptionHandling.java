package exception.handling;

public class ArithmeticExceptionHandling {
    public static void main(String[] args) {
        System.out.println("Hello USA");
        try {
            int i = 10/0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception");
        }

        System.out.println("Hello DE");
    }
}
