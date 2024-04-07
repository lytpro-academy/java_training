package threading.basics.creation;

/**
 * Thread4 class implements the Runnable interface to create a thread that prints a message.
 */
public class Thread4 implements Runnable {

    // Overriding the run() method to define thread behavior
    public void run() {
        System.out.println("Now the thread is running ...");
    }

    // Main method, entry point of the program
    public static void main(String argvs[]) {
        // creating an object of the class MyThread2
        Runnable r1 = new Thread4();

        // creating an object of the class Thread using Thread(Runnable r, String name)
        Thread th1 = new Thread(r1, "New thread");

        // the start() method moves the thread to the active state
        th1.start();

        // getting the thread name by invoking the getName() method
        String str = th1.getName();
        System.out.println(str);
    }
}
