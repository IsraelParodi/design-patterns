package Adapter.Adapters;

import Adapter.Gateways.PayPal;
import Adapter.Interfaces.PaymentProcessor;

public class PayPalAdapter implements PaymentProcessor {
    private final PayPal payPal;

    public PayPalAdapter(PayPal payPal) {
        this.payPal = payPal;
    }

    @Override
    public void processPayment(double amount) {
        String userEmail = "user@example.com";  // Mock email for PayPal
        payPal.makePayment(userEmail, amount);
    }
}

