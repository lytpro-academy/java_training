package threading.concurrency.threadpool;

/**
 * WorkerThread class implements the Runnable interface to define a worker thread.
 */
public class WorkerThread implements Runnable {

    // Instance variable to hold the message for the thread
    private String message;

    // Constructor to initialize the message
    public WorkerThread(String s){
        this.message = s;
    }

    // Overriding the run() method to define thread behavior
    public void run() {
        // Printing the start message along with the thread name and the message
        System.out.println(Thread.currentThread().getName() + " (Start) message = " + message);

        // Sleeping the thread for 2 seconds
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            // Handling the InterruptedException
            e.printStackTrace();
        }

        // Printing the end message along with the thread name
        System.out.println(Thread.currentThread().getName() + " (End)");
    }
}
