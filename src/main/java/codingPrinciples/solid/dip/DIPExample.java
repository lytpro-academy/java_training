package codingPrinciples.solid.dip;

/**
 * Main class to demonstrate Dependency Inversion Principle (DIP):
 * Explanation:
 * •	In this example, we have the MessageSender interface, representing the abstraction for sending messages. Both EmailSender and SMSSender classes implement this interface.
 * •	The NotificationService class represents a high-level module that depends on the MessageSender abstraction. It has a constructor that accepts a MessageSender, allowing different message senders to be injected.
 * •	By depending on the MessageSender abstraction, the NotificationService class adheres to the Dependency Inversion Principle (DIP). It does not directly depend on concrete implementations (EmailSender or SMSSender), promoting flexibility and decoupling.
 * •	In the main method, we demonstrate how the NotificationService can be used with different message senders (email or SMS) without modifying the NotificationService class. This illustrates the flexibility achieved through DIP.
 * */
public class DIPExample {
    public static void main(String[] args) {
        // Using EmailSender for sending notifications
        MessageSender emailSender = new EmailSender();
        NotificationService emailNotificationService = new NotificationService(emailSender);
        emailNotificationService.sendNotification("Hello, this is an email notification!");

        // Using SMSSender for sending notifications
        MessageSender smsSender = new SMSSender();
        NotificationService smsNotificationService = new NotificationService(smsSender);
        smsNotificationService.sendNotification("Hello, this is an SMS notification!");
    }
}

