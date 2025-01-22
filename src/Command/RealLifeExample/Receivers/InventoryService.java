package Command.RealLifeExample.Receivers;

public class InventoryService {
    public boolean checkStock(String productId, int quantity) {
        // Assume this method checks if the product is available in the warehouse
        System.out.println("Checking stock for product " + productId + " with quantity " + quantity);
        return true; // Let's assume the stock is always available for simplicity
    }

    public void updateStock(String productId, int quantity) {
        System.out.println("Updating stock for product " + productId + " by " + quantity);
    }

    public void undoUpdateInventory(String productId) {
        System.out.println("Undo stock update for product " + productId);
    }
}

