package threading.concurrency;

import java.util.concurrent.atomic.AtomicInteger;


/**
 * Atomic operations in multithreading refer to operations that are performed as a single, indivisible unit of
 * execution. In other words, these operations are guaranteed to be thread-safe and appear as if they occur
 * instantaneously from the perspective of other threads. Atomicity ensures that when multiple threads concurrently
 * access shared data and perform atomic operations, the operations are completed without interference or race
 * conditions, preserving data consistency and integrity.
 *
 *
 * Explanation
 * In below example, multiple threads concurrently increment an AtomicInteger counter using the incrementAndGet()
 * method, which is an atomic operation. The use of AtomicInteger ensures that the increment operation is thread-safe,
 * and the final value of the counter reflects the sum of increments performed by all threads.
 * */
public class AtomicExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Multiple threads incrementing the counter atomically
        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                for (int j = 0; j < 1000; j++) {
                    counter.incrementAndGet(); // Atomic increment operation
                }
            }).start();
        }

        // Wait for all threads to complete
        try {
            Thread.sleep(2000); // Wait for 2 seconds to ensure all threads finish
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final value of the counter
        System.out.println("Final value of counter: " + counter.get());
    }
}

