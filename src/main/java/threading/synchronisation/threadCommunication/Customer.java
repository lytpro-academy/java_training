package threading.synchronisation.threadCommunication;

/**
 * Customer class represents a customer account with methods for withdrawing and depositing money.
 */
public class Customer {
    // Instance variable to store the account balance
    int amount = 10000;

    // Method to withdraw money from the account (synchronized)
    synchronized void withdraw(int amount){
        System.out.println("going to withdraw...");

        // Checking if sufficient balance is available
        if(this.amount < amount){
            System.out.println("Less balance; waiting for deposit...");
            try{
                // Waiting for deposit notification
                wait();
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }

        // Deducting the withdrawn amount from the account balance
        this.amount -= amount;
        System.out.println("withdraw completed...");
    }

    // Method to deposit money into the account (synchronized)
    synchronized void deposit(int amount){
        System.out.println("going to deposit...");

        // Adding the deposited amount to the account balance
        this.amount += amount;
        System.out.println("deposit completed... ");

        // Notifying waiting threads about the deposit
        notify();
    }
}
