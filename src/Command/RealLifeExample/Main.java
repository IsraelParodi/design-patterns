package Command.RealLifeExample;

import Command.RealLifeExample.Command.Implementations.AuthorizePaymentCommand;
import Command.RealLifeExample.Command.Implementations.GenerateShippingLabelCommand;
import Command.RealLifeExample.Command.Implementations.UpdateInventoryCommand;
import Command.RealLifeExample.Invokers.OrderProcessor;
import Command.RealLifeExample.Receivers.InventoryService;
import Command.RealLifeExample.Receivers.PaymentService;
import Command.RealLifeExample.Receivers.ShippingService;

public class Main {
    public static void main(String[] args) {
        // Simulate order request data
        String orderId = "ORD123";
        String productId = "PROD001";
        int quantity = 3;

        // Create the Receivers
        PaymentService paymentService = new PaymentService();
        InventoryService inventoryService = new InventoryService();
        ShippingService shippingService = new ShippingService();

        // Create the OrderProcessor instance
        OrderProcessor processor = new OrderProcessor();

        // Add commands to the processor, passing the receivers to each command
        processor.addCommand(new AuthorizePaymentCommand(orderId, paymentService));
        processor.addCommand(new UpdateInventoryCommand(productId, quantity, inventoryService));
        processor.addCommand(new GenerateShippingLabelCommand(orderId, shippingService));

        // Process the order
        try {
            processor.processOrder();
            System.out.println("Order processed successfully!");
        } catch (Exception e) {
            System.out.println("Failed to process order: " + e.getMessage());
            // Rollback the changes if something goes wrong
            System.out.println("Rolling back the order...");
            processor.undo();
        }
    }
}
