package exception.handling;

public class FinallyExample {

    public static void main(String[] args) {
        try {
            System.out.println("before exception in try block");
            int i = 19/0;
            System.out.println("after exception in try block");
        }
        catch (Exception e) {
            System.out.println("in the exception block "+e.getMessage());
        } finally {
            System.out.println("in the finally block");
        }
    }

}
