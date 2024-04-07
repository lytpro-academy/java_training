package threading.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicExample {
    private static AtomicInteger counter = new AtomicInteger(0);

    public static void main(String[] args) {
        // Increment counter atomically by 1
        System.out.println("Initial value: " + counter.get());
        counter.incrementAndGet();
        System.out.println("Value after increment: " + counter.get());

        // Decrement counter atomically by 1
        counter.decrementAndGet();
        System.out.println("Value after decrement: " + counter.get());

        // Add a specific value atomically
        int delta = 5;
        counter.addAndGet(delta);
        System.out.println("Value after adding " + delta + ": " + counter.get());

        // Compare and set operation
        int expectedValue = 5;
        int newValue = 10;
        boolean updated = counter.compareAndSet(expectedValue, newValue);
        System.out.println("Value after compare and set: " + counter.get() + " (Updated: " + updated + ")");
    }
}

