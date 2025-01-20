package Adapter.Adapters;

import Adapter.Gateways.PayPal;
import Adapter.Gateways.Stripe;
import Adapter.Interfaces.PaymentProcessor;

public class StripeAdapter implements PaymentProcessor {
    private final Stripe stripe;

    public StripeAdapter(Stripe stripe) {
        this.stripe = stripe;
    }

    @Override
    public void processPayment(double amount) {
        String cardNumber = "4111111111111111";  // Mock card number for Stripe
        stripe.chargeCard(cardNumber, amount);
    }
}


