package Command.RealLifeExample.Receivers;

public class ShippingService {
    public void scheduleShipping(String orderId, String shippingAddress) {
        System.out.println("Scheduling shipping for order " + orderId + " to address: " + shippingAddress);
    }

    public void generateShippingLabel(String orderId) {
        System.out.println("Generating shipping label for order " + orderId);
    }

    public void undoGenerateShippingLabel(String orderId) {
        System.out.println("Undo generating shipping label for order " + orderId);
    }
}