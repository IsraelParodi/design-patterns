package Strategy.Context;

import Strategy.Strategy.Payment.PaymentStrategy;

public abstract class PaymentProcessor {
    protected PaymentStrategy paymentStrategy;

    public PaymentProcessor(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(double amount) {
        if (paymentStrategy == null) {
            throw new IllegalStateException("PaymentStrategy not set");
        }
        paymentStrategy.pay(amount);
    }

    // Abstract method for additional behavior
    public abstract void displayPaymentDetails(double amount);
}
