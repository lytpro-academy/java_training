package threading.synchronisation.basics.concept;

/**
 * Thread2 class extends the Thread class to define a thread that calls a method on an instance of Manager.
 */
public class Thread2 extends Thread{
    private Manager t;

    // Constructor to initialize Manager instance
    Thread2(Manager t){
        this.t = t;
    }

    // Overriding the run() method to define thread behavior
    public void run(){
        t.printTable(100);
    }
}
