package threading.basics;

/**
 * Explanation:
 * ThreadLocal in Java provides thread-local variables. These variables are accessible only within the thread they are
 * associated with and provide data isolation among threads. Each thread accessing a ThreadLocal variable has its own
 * independently initialized copy of the variable. This is particularly useful in scenarios where you want to maintain
 * per-thread context or state without worrying about thread safety.
 * */
public class ThreadLocalExp {
    public static class MyRunnable implements Runnable
    {
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<>();

        @Override
        public void run() {

            // set the value of a ThreadLocal variable to a random integer between 0 and 49
            threadLocal.set( (int) (Math.random() * 50D) );
            try
            {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(threadLocal.get());
        }
    }

    public static void main(String[] args)
    {
        MyRunnable runnableInstance = new MyRunnable();
        Thread t1 = new Thread(runnableInstance);
        Thread t2 = new Thread(runnableInstance);
        // this will call run() method
        t1.start();
        t2.start();
    }
}
