package threading.synchronisation.deadlock;

/**
 * DeadlockSolution class demonstrates a solution to the deadlock problem using proper ordering of resource acquisition.
 */
public class DeadlockSolution {

    // Main method, entry point of the program
    public static void main(String ar[]) {
        DeadlockSolution test = new DeadlockSolution();

        // Creating instances of resource1 and resource2
        final resource1 a = test.new resource1();
        final resource2 b = test.new resource2();

        // Thread-1
        Runnable b1 = new Runnable() {
            public void run() {
                synchronized (a) {
                    try {
                        /* Adding delay so that both threads can start trying to lock resources */
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    // Thread-1 have resource1 but need resource2 also
                    synchronized (b) {
                        System.out.println("In block 1");
                    }
                }
            }
        };

        // Thread-2
        Runnable b2 = new Runnable() {
            public void run() {
                synchronized (a) {
                    // Thread-2 have resource2 but need resource1 also
                    synchronized (b) {
                        System.out.println("In block 2");
                    }
                }
            }
        };

        // Starting both threads
        new Thread(b1).start();
        new Thread(b2).start();
    }

    // resource1 class
    private class resource1 {
        private int i = 10;
        public int getI() {
            return i;
        }
        public void setI(int i) {
            this.i = i;
        }
    }

    // resource2 class
    private class resource2 {
        private int i = 20;
        public int getI() {
            return i;
        }
        public void setI(int i) {
            this.i = i;
        }
    }
}

