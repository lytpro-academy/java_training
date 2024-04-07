package threading.basics.creation;

/**
 * Thread1 class extends the Thread class to create a thread that prints a message.
 */
public class Thread1 extends Thread {

    // Overriding the run() method to define thread behavior
    public void run(){
        System.out.println("thread is running...");
    }

    // Main method, entry point of the program
    public static void main(String args[]){
        // Creating an instance of the Thread1 class
        Thread1 t1 = new Thread1();

        // Starting the first thread by invoking the start() method
        t1.start();

        // Attempting to start another thread of the same type, which will throw IllegalThreadStateException
        Thread1 t2 = new Thread1();
        t2.start();
    }
}
