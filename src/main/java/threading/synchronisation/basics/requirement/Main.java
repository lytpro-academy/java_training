package threading.synchronisation.basics.requirement;

/**
 * Main class creates a Manager object and two threads to demonstrate synchronization.
 */
public class Main {
    // Main method, entry point of the program
    public static void main(String args[]){
        // Creating a single Manager object
        Manager obj = new Manager();

        // Creating two threads with the Manager object
        Thread1 t1=new Thread1(obj);
        Thread2 t2=new Thread2(obj);

        // Starting both threads
        t1.start();
        t2.start();
    }
}
