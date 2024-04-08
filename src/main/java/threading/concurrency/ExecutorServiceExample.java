package threading.concurrency;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *In Java, the Executor and ExecutorService interfaces are used to manage and execute tasks asynchronously.
 * They provide a higher-level abstraction for executing tasks in a thread pool, which helps improve performance and
 * manage resources efficiently.
 */
public class ExecutorServiceExample {
        public static void main(String[] args) {
        // Create an ExecutorService with a fixed-size thread pool
        ExecutorService executor = Executors.newFixedThreadPool(3);

        // Submit tasks to the executor for execution
        for (int i = 1; i <= 5; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " is executing on thread: " + Thread.currentThread().getName());
            });
        }

        // Shutdown the executor to release its resources
        executor.shutdown();
    }
}