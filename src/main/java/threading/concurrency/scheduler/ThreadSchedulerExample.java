package threading.concurrency.scheduler;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * ThreadSchedulerExample class demonstrates the usage of a fixed-size thread pool to schedule and execute tasks.
 */
public class ThreadSchedulerExample {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Create a fixed-size thread pool with 3 threads
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor
        executor.submit(new Task("Task 1", 1000));
        executor.submit(new Task("Task 2", 2000));
        executor.submit(new Task("Task 3", 3000));

        // Shutdown the executor after all tasks are completed
        executor.shutdown();
    }

    // Task class to represent individual tasks
    static class Task implements Runnable {
        private String name;
        private long duration;

        // Constructor to initialize task name and duration
        public Task(String name, long duration) {
            this.name = name;
            this.duration = duration;
        }

        // Overriding the run() method to define task behavior
        @Override
        public void run() {
            System.out.println(name + " started.");
            try {
                // Simulate execution by sleeping for the specified duration
                Thread.sleep(duration);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + " completed.");
        }
    }
}
