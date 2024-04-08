package threading.basics;

/**
 * Main class provides information about the main thread and all active threads in the JVM.
 */
public class Main {

    // Main method, entry point of the program
    public static void main(String[] args) {
        // Print a simple message
        System.out.println("Hello, World!");

        // Get the main thread
        Thread mainThread = Thread.currentThread();

        // Print information about the main thread
        System.out.println("Main Thread Name: " + mainThread.getName());
        System.out.println("Main Thread ID: " + mainThread.getId());
        System.out.println("Main Thread Priority: " + mainThread.getPriority());
        System.out.println("Main Thread State: " + mainThread.getState());
        System.out.println("Main Thread Group: " + mainThread.getThreadGroup());

        // Get all active threads in the JVM
        Thread[] allThreads = new Thread[Thread.activeCount()];
        Thread.enumerate(allThreads);


        // Print information about all active threads
        System.out.println("\nActive Threads:");
        for (Thread thread : allThreads) {
            System.out.println("Thread Name: " + thread.getName());
            System.out.println("Thread ID: " + thread.getId());
            System.out.println("Thread Priority: " + thread.getPriority());
            System.out.println("Thread State: " + thread.getState());
            System.out.println("Thread Group: " + thread.getThreadGroup());
            System.out.println("---------------------------------------");
        }
    }

}

