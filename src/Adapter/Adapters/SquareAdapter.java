package Adapter.Adapters;

import Adapter.Gateways.PayPal;
import Adapter.Gateways.Square;
import Adapter.Interfaces.PaymentProcessor;

public class SquareAdapter implements PaymentProcessor {
    private final Square square;

    public SquareAdapter(Square square) {
        this.square = square;
    }

    @Override
    public void processPayment(double amount) {
        String phoneNumber = "1234567890";  // Mock phone number for Square
        square.charge(phoneNumber, amount);
    }
}


