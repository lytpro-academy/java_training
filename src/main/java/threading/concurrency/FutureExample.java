package threading.concurrency;

import java.util.concurrent.*;
/**
 In Java multithreading, a Future represents the result of an asynchronous computation. It allows you to check if the
 computation is complete, retrieve the result when it is available, or cancel the computation if necessary.

 The Future interface provides methods for checking if the computation is done (isDone()), blocking until the result is
 available (get()), and canceling the computation (cancel()). It also allows you to check if the computation was canceled (isCancelled()).
 */
public class FutureExample {

    public static void main(String[] args) {
        // Create a thread pool with a single worker thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Submit a task to the executor and obtain a Future object
        Future<Integer> future = executor.submit(() -> {
            // Simulate a time-consuming computation
            Thread.sleep(2000);
            return 42; // Return a result
        });

        // Do other work while waiting for the computation to complete
        System.out.println("Do something else while waiting...");

        try {
            // Block until the computation is done and retrieve the result
            int result = future.get();
            System.out.println("Result: " + result);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }

        // Shutdown the executor
        executor.shutdown();
    }

}
