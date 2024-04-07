package threading.synchronisation.threadCommunication;

/**
 * Test class creates a Customer object and two threads to demonstrate concurrent operations on the customer's account.
 */
public class Test {
    // Main method, entry point of the program
    public static void main(String args[]) {
        // Creating a single Customer object
        final Customer c = new Customer();

        // Creating a thread to withdraw money from the customer's account
        new Thread() {
            public void run() {
                c.withdraw(15000);
            }
        }.start();

        // Creating a thread to deposit money into the customer's account
        new Thread() {
            public void run() {
                c.deposit(10000);
            }
        }.start();
    }
}
