package Strategy;

// This pattern defines a family of algorithms, encapsulates each one, and makes them interchangeable.
// Strategy lets algorithm vary independently of clients that use it
// We usually encapsulate the behaviors that are constantly in change

import Strategy.Context.PaymentProcessor;
import Strategy.Context.Specialized.OnlineStorePaymentProcessor;
import Strategy.Context.Specialized.SubscriptionPaymentProcessor;
import Strategy.Strategy.Payment.CreditCardPayment;
import Strategy.Strategy.Payment.CryptoPayment;
import Strategy.Strategy.Payment.PaymentStrategy;
import Strategy.Strategy.Payment.PaypalPayment;

public class Main {
    public static void main(String[] args) {
        // Online store payment with Credit Card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9876-5432");
        PaymentProcessor storePaymentProcessor = new OnlineStorePaymentProcessor(creditCardPayment);
        storePaymentProcessor.displayPaymentDetails(250.00);

        // Subscription payment with PayPal
        PaymentStrategy paypalPayment = new PaypalPayment("user@example.com");
        PaymentProcessor subscriptionProcessor = new SubscriptionPaymentProcessor(paypalPayment);
        subscriptionProcessor.displayPaymentDetails(50.00);

        // Online store payment with Cryptocurrency
        PaymentStrategy cryptoPayment = new CryptoPayment("0xABC123XYZ456");
        storePaymentProcessor.setPaymentStrategy(cryptoPayment);
        storePaymentProcessor.displayPaymentDetails(300.00);
    }
}