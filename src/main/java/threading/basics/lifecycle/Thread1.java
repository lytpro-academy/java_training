package threading.basics.lifecycle;

/**
 * Thread1 class implements the Runnable interface to define thread behavior for demonstration purposes.
 */
public class Thread1 implements Runnable {

    // Overriding the run() method to define thread behavior
    public void run() {
        try {
            // moving thread t2 to the state timed waiting
            Thread.sleep(100);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }

        // Printing the state of thread t1 while it invoked the method join() on thread t2
        System.out.println("The state of thread t1 while it invoked the method join() on thread t2 -"+ ThreadState.t1.getState());

        try {
            // Sleeping for 200 milliseconds
            Thread.sleep(200);
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}

