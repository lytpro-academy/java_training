package threading.basics;

/**
 * Explanation:
 * Daemon threads are threads that provide services to user threads or perform background tasks.
 * They are marked as daemon threads using the setDaemon(true) method before starting the thread.
 * Daemon threads are automatically terminated when all user threads have completed their execution and the program is about to exit. In other words, they do not prevent the JVM from exiting.
 * Daemon threads are commonly used for tasks such as garbage collection, monitoring, or handling background services.
 * They are meant to support and complement the execution of user threads without keeping the program alive unnecessarily.
 * */
public class DaemonThread extends Thread
{
    public DaemonThread(String name){
        super(name);
    }
    public void run()
    {
        // Checking whether the thread is Daemon or not
        if(Thread.currentThread().isDaemon())
        {
            System.out.println(getName() + " is Daemon thread");
        }
        else
        {
            System.out.println(getName() + " is User thread");
        }
    }
    public static void main(String[] args)
    {
        DaemonThread t1 = new DaemonThread("t1");
        DaemonThread t2 = new DaemonThread("t2");
        DaemonThread t3 = new DaemonThread("t3");
        // Setting user thread t1 to Daemon
        t1.setDaemon(true);
        // starting first 2 threads
        t1.start();
        t2.start();
        // Setting user thread t3 to Daemon
        t3.setDaemon(true);
        t3.start();
    }
}

