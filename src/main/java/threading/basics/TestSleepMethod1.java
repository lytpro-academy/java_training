package threading.basics;

/**
 * TestSleepMethod1 class extends the Thread class to demonstrate the usage of the sleep() method.
 */
public class TestSleepMethod1 extends Thread{

    // Overriding the run() method to define thread behavior
    public void run(){
        for(int i=1;i<5;i++){
            try{
                // Putting the thread to sleep for 5000 milliseconds
                Thread.sleep(5000); // throws checked exception InterruptedException
            }catch(InterruptedException e){
                // Handling the InterruptedException
                System.out.println(e);
            }
            // Printing the value of i after waking up from sleep
            System.out.println(i);
        }
    }

    // Main method, entry point of the program
    public static void main(String args[]){
        // Creating instances of the TestSleepMethod1 class
        TestSleepMethod1 t1=new TestSleepMethod1();
        TestSleepMethod1 t2=new TestSleepMethod1();

        // Starting both threads
        t1.start();
        t2.start();

        // Interrupting the first thread
        t1.interrupt();
    }
}
