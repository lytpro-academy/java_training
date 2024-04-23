package designPatterns.behavioral.strategy;

// Concrete strategies
class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }
}
