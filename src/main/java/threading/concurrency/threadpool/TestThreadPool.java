package threading.concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * TestThreadPool class demonstrates the usage of a thread pool to execute multiple tasks concurrently.
 */
public class TestThreadPool {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Creating a fixed thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Creating and submitting worker threads to the thread pool
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("" + i);
            executor.execute(worker);//calling execute method of ExecutorService
        }

        // Shutting down the thread pool
        executor.shutdown();

        // Waiting for all tasks to complete
        while (!executor.isTerminated()) {   }

        // Printing a message after all tasks have completed
        System.out.println("Finished all threads");
    }
}
