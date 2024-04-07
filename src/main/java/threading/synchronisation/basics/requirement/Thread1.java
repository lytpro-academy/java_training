package threading.synchronisation.basics.requirement;

/**
 * Thread1 class extends the Thread class to define a thread that calls a method on an instance of Manager.
 */
public class Thread1 extends Thread {
    private Manager t;

    // Constructor to initialize Manager instance
    Thread1(Manager t){
        this.t = t;
    }

    // Overriding the run() method to define thread behavior
    public void run(){
        t.printTable(5);
    }
}
