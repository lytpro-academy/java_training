package threading.synchronisation.basics.lock;

public class VolatileIntExample {
    private static volatile int MY_INT = 0;

    public static void main(String[] args) {
        new ChangeListener().start(); // Thread that checks for changes in MY_INT
        new ChangeMaker().start(); // Thread that increments MY_INT
    }

    static class ChangeListener extends Thread {
        @Override
        public void run() {
            int local_value = MY_INT;
            while ( local_value < 5){
                if( local_value!= MY_INT){
                    System.out.println("Got Change for MY_INT : " + MY_INT);
                    local_value = MY_INT;
                }
            }
        }
    }

    static class ChangeMaker extends Thread{
        @Override
        public void run() {

            int local_value = MY_INT;
            while (MY_INT <5){
                System.out.println("Incrementing MY_INT to " + (local_value+1));
                MY_INT = ++local_value; // increment MY_INT
                try {
                    Thread.sleep(500); // Added sleep to make the output more readable
                } catch (InterruptedException e) { e.printStackTrace(); }
            }
        }
    }
}
