package codingPrinciples.solid.dip;
/**
 * High-level module that depends on MessageSender abstraction
 */
class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void sendNotification(String message) {
        // High-level module depends on abstraction (MessageSender) instead of concrete implementation
        messageSender.sendMessage(message);
    }
}
