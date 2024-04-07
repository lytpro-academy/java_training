package threading.synchronisation.deadlock;

/**
 * DeadlockExample class demonstrates a deadlock scenario where two threads attempt to acquire resources in opposite order.
 */
public class DeadlockExample {
    // Main method, entry point of the program
    public static void main(String[] args) {
        // Define two resources
        final String resource1 = "resource1";
        final String resource2 = "resource2";

        // Thread t1 tries to lock resource1 then resource2
        Thread t1 = new Thread() {
            public void run() {
                synchronized (resource1) {
                    System.out.println("Thread 1: locked resource 1");

                    try {
                        // Adding delay to simulate processing
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (resource2) {
                        System.out.println("Thread 1: locked resource 2");
                    }
                }
            }
        };

        // Thread t2 tries to lock resource2 then resource1
        Thread t2 = new Thread() {
            public void run() {
                synchronized (resource2) {
                    System.out.println("Thread 2: locked resource 2");

                    try {
                        // Adding delay to simulate processing
                        Thread.sleep(100);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    synchronized (resource1) {
                        System.out.println("Thread 2: locked resource 1");
                    }
                }
            }
        };

        // Start both threads
        t1.start();
        t2.start();
    }
}
