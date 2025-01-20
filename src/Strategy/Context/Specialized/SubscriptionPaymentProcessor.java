package Strategy.Context.Specialized;

import Strategy.Context.PaymentProcessor;
import Strategy.Strategy.Payment.PaymentStrategy;

public class SubscriptionPaymentProcessor extends PaymentProcessor {
    public SubscriptionPaymentProcessor(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void displayPaymentDetails(double amount) {
        System.out.println("Processing subscription payment...");
        System.out.println("Subscription fee: $" + amount);
        this.processPayment(amount);
    }
}

