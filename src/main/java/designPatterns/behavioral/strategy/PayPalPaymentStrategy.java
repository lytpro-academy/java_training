package designPatterns.behavioral.strategy;

/**
 * The Strategy pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
 * It allows a client to choose an algorithm from a family of algorithms at runtime without changing the client's code.
 *
 * The Strategy pattern is useful when a system needs to support multiple variants of an algorithm or when an
 * algorithm's behavior needs to be determined dynamically at runtime. It's commonly used in sorting algorithms,
 * payment processing systems, and game development.
 * */
class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}
