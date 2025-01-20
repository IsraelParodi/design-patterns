package Facade.Service;

public class PaymentService {
    public boolean authorizePayment(double amount) {
        // Assume this method interacts with a payment gateway to authorize the payment
        System.out.println("Authorizing payment for amount: " + amount);
        return true; // Assume payment is always successful
    }
}
