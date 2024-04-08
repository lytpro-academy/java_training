package threading.synchronisation.basics;

public class VolatileExample  {
    private static volatile boolean flag = false;

    public static void main(String[] args) {
        // Thread 1 - Writer
        new Thread(() -> {
            try {
                Thread.sleep(1000); // Simulating some task
                flag = true; // Changing the value of 'flag'
                System.out.println("Flag set to true.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();

        // Thread 2 - Reader
        new Thread(() -> {
            while (!flag) { // Polling until 'flag' becomes true
                System.out.println("is flag set to false.");
            }
            System.out.println("Flag is now true.");
        }).start();
    }
}
