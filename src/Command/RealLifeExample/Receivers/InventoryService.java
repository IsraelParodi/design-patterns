package Command.RealLifeExample.Receivers;

public class InventoryService {
    public void updateInventory(String productId, int quantity) {
        System.out.println("Updated inventory for Product ID: " + productId + " with quantity: " + quantity);
    }

    public void undoUpdateInventory(String productId) {
        System.out.println("Inventory update undone for Product ID: " + productId);
    }
}

