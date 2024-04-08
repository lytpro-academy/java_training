package threading.basics;

/**
 * Explanation:
 * ThreadGroup in Java is a class that represents a group of threads. It provides a mechanism for organizing and
 * managing multiple threads as a single unit. Thread groups can be helpful for managing threads with a common purpose,
 * controlling their behavior collectively, and simplifying thread management tasks.
 */
public class ThreadGroupExample {
    public static void main(String[] args) {
        // Create a thread group
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        // Create and start threads within the thread group
        Thread thread1 = new Thread(group, new MyRunnable(), "Thread 1");
        Thread thread2 = new Thread(group, new MyRunnable(), "Thread 2");
        thread1.start();
        thread2.start();

        // Display information about the thread group
        group.list(); // Print information about threads in the thread group
        System.out.println("Active threads in the group: " + group.activeCount());
    }

    // Runnable implementation for threads
    static class MyRunnable implements Runnable {
        public void run() {
            System.out.println("Executing thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(1000); // Simulate some task
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}