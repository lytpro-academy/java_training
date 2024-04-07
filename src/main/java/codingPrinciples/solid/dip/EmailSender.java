package codingPrinciples.solid.dip;

/**
 * Class for sending email messages
 */
class EmailSender implements MessageSender {
    @Override
    public void sendMessage(String message) {
        System.out.println("Sending email message: " + message);
    }
}

