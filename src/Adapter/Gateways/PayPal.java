package Adapter.Gateways;

public class PayPal {
    public void makePayment(String userEmail, double amount) {
        System.out.println("Processing PayPal payment for " + userEmail + " of amount " + amount);
    }
}
