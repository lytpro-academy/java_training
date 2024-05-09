package threading.synchronisation.basics.lock;

public class ObjectLevelLockExample {
    public synchronized void objectLevelLockMethod()
    {
        synchronized (this)
        {
            //DO your stuff here
        }
    }
}

