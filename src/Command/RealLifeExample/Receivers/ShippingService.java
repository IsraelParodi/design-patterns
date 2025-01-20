package Command.RealLifeExample.Receivers;

public class ShippingService {
    public void generateShippingLabel(String orderId) {
        System.out.println("Shipping label generated for Order ID: " + orderId);
    }

    public void undoGenerateShippingLabel(String orderId) {
        System.out.println("Shipping label generation undone for Order ID: " + orderId);
    }
}