package threading.basics;

/**
 * TestCallRunMethod class extends the Thread class to demonstrate the difference between start() and run() methods.
 */
public class TestCallRunMethod extends Thread{

    // Overriding the run() method to define thread behavior
    public void run(){
        System.out.println("running...");
    }

    // Main method, entry point of the program
    public static void main(String args[]){
        // Creating an instance of the TestCallRunMethod class
        TestCallRunMethod t1=new TestCallRunMethod();

        // Starting the thread using the start() method
        t1.start();

        // Invoking the run() method directly, which does not start a separate call stack
        t1.run();
    }
}
