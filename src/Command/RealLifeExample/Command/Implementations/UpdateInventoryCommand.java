package Command.RealLifeExample.Command.Implementations;

import Command.RealLifeExample.Command.Command;
import Command.RealLifeExample.Receivers.InventoryService;

public class UpdateInventoryCommand implements Command {
    private String productId;
    private int quantity;
    private InventoryService inventoryService;

    public UpdateInventoryCommand(String productId, int quantity, InventoryService inventoryService) {
        this.productId = productId;
        this.quantity = quantity;
        this.inventoryService = inventoryService;
    }

    @Override
    public void execute() {
        inventoryService.updateStock(productId, quantity);
    }

    @Override
    public void undo() {
        inventoryService.undoUpdateInventory(productId);
    }
}