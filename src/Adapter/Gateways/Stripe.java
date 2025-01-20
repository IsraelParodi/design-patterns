package Adapter.Gateways;

public class Stripe {
    public void chargeCard(String cardNumber, double amount) {
        System.out.println("Processing Stripe payment for card " + cardNumber + " of amount " + amount);
    }
}
