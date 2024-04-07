package threading.basics;

public class SetDaemonThreadAfterStartMethod extends Thread
{
    public void run()
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Check if its DaemonThread: "
                + Thread.currentThread().isDaemon());
    }
    public static void main(String[] args)
    {
        SetDaemonThreadAfterStartMethod t1 = new SetDaemonThreadAfterStartMethod();
        SetDaemonThreadAfterStartMethod t2 = new SetDaemonThreadAfterStartMethod();
        t1.start();
        // Exception as the thread is already started
        t1.setDaemon(true);
        t2.start();
    }
}
