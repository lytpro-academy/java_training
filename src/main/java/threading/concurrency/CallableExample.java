package threading.concurrency;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Callable provides additional features compared to Runnable, such as returning a result and throwing checked
 * exceptions, making it suitable for tasks that require these functionalities. However, Runnable is simpler and more
 * lightweight, making it appropriate for tasks that do not require returning a result or throwing exceptions.
 */
public class CallableExample {

    public static void main(String[] args) throws Exception {
        // Create an ExecutorService with a single worker thread
        ExecutorService executor = Executors.newSingleThreadExecutor();

        // Create a Callable task
        Callable<Integer> callableTask = () -> {
            System.out.println("Callable task is executing...");
            Thread.sleep(2000); // Simulate a time-consuming computation
            return 42; // Return a result
        };

        // Submit the Callable task to the executor
        Future<Integer> future = executor.submit(callableTask);

        // Do other work while waiting for the result
        System.out.println("Do something else while waiting...");

        // Get the result of the Callable task
        int result = future.get();
        System.out.println("Result: " + result);

        // Shutdown the executor
        executor.shutdown();
    }
}