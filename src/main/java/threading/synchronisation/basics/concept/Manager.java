package threading.synchronisation.basics.concept;

/**
 * Manager class defines a method to print the multiplication table for a given number.
 */
public class Manager {

    // Method to print the multiplication table (not synchronized)
   void printTable(int n) {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread() +" -- "+ n*i); // 5 * 1
            try {
                // Adding delay to simulate processing
                Thread.sleep(400);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        synchronized(this){//synchronized block
            for(int i=1;i<=5;i++){
            System.out.println(Thread.currentThread() +" -- "+ n*i);
                try{
                    Thread.sleep(400);
                }catch(Exception e){System.out.println(e);}
            }
        }

    }
}
