package Facade;

import Facade.Facade.OrderProcessingFacade;
import Facade.Service.InventoryService;
import Facade.Service.NotificationService;
import Facade.Service.PaymentService;
import Facade.Service.ShippingService;

// The facade pattern provides a unified interface to a set of interfaces in a subsystem. It defines a higher level interface
// to make the subsystem easier to use

// The principle of least knowledge guides us to reduce the interaction between objects to just a few of them, this principle
// prevent us from create a large number of classes coupled together
public class Main {
    public static void main(String[] args) {
        // Initialize subsystems
        InventoryService inventoryService = new InventoryService();
        PaymentService paymentService = new PaymentService();
        ShippingService shippingService = new ShippingService();
        NotificationService notificationService = new NotificationService();

        // Initialize facade
        OrderProcessingFacade orderProcessingFacade = new OrderProcessingFacade(inventoryService, paymentService, shippingService, notificationService);

        // Process an order
        String orderId = "12345";
        String productId = "P001";
        int quantity = 2;
        double amount = 200.00;
        String shippingAddress = "123 Main St, Springfield";
        String customerEmail = "customer@example.com";

        // Client only interacts with the facade
        orderProcessingFacade.processOrder(orderId, productId, quantity, amount, shippingAddress, customerEmail);
    }
}
