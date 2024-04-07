package threading.basics.creation;

/**
 * Thread3 class demonstrates the creation and naming of a thread using the Thread class constructor.
 */
public class Thread3 {

    // Main method, entry point of the program
    public static void main(String argvs[]) {
        // creating an object of the Thread class using the constructor Thread(String name)
        Thread t= new Thread("My thread");

        // the start() method moves the thread to the active state
        t.start();

        // getting the thread name by invoking the getName() method
        String str = t.getName();
        System.out.println(str);
    }
}
