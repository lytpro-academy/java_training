package basics;

/**
 * Anonymous classes are inner classes with no name. Since they have no name, we can’t use them in order to create
 * instances of anonymous classes. As a result, we have to declare and instantiate anonymous classes in a single
 * expression at the point of use.
 * We may either extend an existing class or implement an interface.
 */
public class AnonymousInnerClass {
    public static void main(String args[])
    {
        // create anonymous inner class object
       new Thread(new Runnable() {
            @Override public void run()
            {
                System.out.println("New thread created");
            }
        }).start();
    }
}
