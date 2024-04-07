package threading.synchronisation.basics.lock;

public class ClassLevelLockExample {
    public void classLevelLockMethod()
    {
        synchronized (ClassLevelLockExample.class)
        {
            //DO your stuff here
        }
    }
}
