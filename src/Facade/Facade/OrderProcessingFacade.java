package Facade.Facade;

import Facade.Service.InventoryService;
import Facade.Service.NotificationService;
import Facade.Service.PaymentService;
import Facade.Service.ShippingService;

public class OrderProcessingFacade {
    private InventoryService inventoryService;
    private PaymentService paymentService;
    private ShippingService shippingService;
    private NotificationService notificationService;

    public OrderProcessingFacade(InventoryService inventoryService, PaymentService paymentService,
                                 ShippingService shippingService, NotificationService notificationService) {
        this.inventoryService = inventoryService;
        this.paymentService = paymentService;
        this.shippingService = shippingService;
        this.notificationService = notificationService;
    }

    public void processOrder(String orderId, String productId, int quantity, double amount, String shippingAddress, String customerEmail) {
        System.out.println("Processing order: " + orderId);

        // Step 1: Check inventory
        boolean isStockAvailable = inventoryService.checkStock(productId, quantity);
        if (!isStockAvailable) {
            System.out.println("Stock is unavailable for product " + productId);
            return;
        }

        // Step 2: Authorize payment
        boolean isPaymentAuthorized = paymentService.authorizePayment(amount);
        if (!isPaymentAuthorized) {
            System.out.println("Payment authorization failed for order " + orderId);
            return;
        }

        // Step 3: Update stock after successful payment
        inventoryService.updateStock(productId, quantity);

        // Step 4: Schedule shipping
        shippingService.scheduleShipping(orderId, shippingAddress);
        shippingService.generateShippingLabel(orderId);

        // Step 5: Send notification
        notificationService.sendConfirmationEmail(orderId, customerEmail);

        System.out.println("Order " + orderId + " processed successfully.");
    }
}
