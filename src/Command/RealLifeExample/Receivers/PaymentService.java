package Command.RealLifeExample.Receivers;

public class PaymentService {
    public void authorizePayment(String orderId) {
        System.out.println("Payment authorized for Order ID: " + orderId);
    }

    public void undoAuthorizePayment(String orderId) {
        System.out.println("Payment authorization undone for Order ID: " + orderId);
    }
}