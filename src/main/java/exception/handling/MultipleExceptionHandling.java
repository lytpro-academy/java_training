package exception.handling;

public class MultipleExceptionHandling {
    public static void main(String[] args) {

        try{
            int a[]=new int[5]; // 0 1 2 3 4
            a[5]=30/10;
        }
        catch(Exception e)
        {
            e.printStackTrace();
            System.out.println("Parent Exception occurs");
        }
        System.out.println("rest of the code");
    }
}
