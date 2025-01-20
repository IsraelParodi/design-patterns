package Facade.Service;

public class NotificationService {
    public void sendConfirmationEmail(String orderId, String customerEmail) {
        System.out.println("Sending order confirmation email to " + customerEmail + " for order " + orderId);
    }
}
