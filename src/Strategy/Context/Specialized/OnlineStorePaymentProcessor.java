package Strategy.Context.Specialized;

import Strategy.Context.PaymentProcessor;
import Strategy.Strategy.Payment.PaymentStrategy;

public class OnlineStorePaymentProcessor extends PaymentProcessor {
    public OnlineStorePaymentProcessor(PaymentStrategy paymentStrategy) {
        super(paymentStrategy);
    }

    @Override
    public void displayPaymentDetails(double amount) {
        System.out.println("Processing online store payment...");
        System.out.println("Amount to pay: $" + amount);
        this.processPayment(amount);
    }
}
