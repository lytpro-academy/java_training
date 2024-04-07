package threading.basics.creation;

/**
 * Thread2 class implements the Runnable interface to create a thread that prints a message.
 */
public class Thread2 implements Runnable {

    // Overriding the run() method to define thread behavior
    public void run(){
        System.out.println("thread is running...");
    }

    // Main method, entry point of the program
    public static void main(String args[]){
        // Creating an instance of the Thread2 class
        Thread2 m1=new Thread2();

        // Creating a Thread object using the constructor Thread(Runnable r)
        Thread t1 = new Thread(m1);

        // Starting the thread by invoking the start() method
        t1.start();
    }
}