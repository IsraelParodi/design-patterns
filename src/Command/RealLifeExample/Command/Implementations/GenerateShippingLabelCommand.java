package Command.RealLifeExample.Command.Implementations;

import Command.RealLifeExample.Command.Command;
import Command.RealLifeExample.Receivers.ShippingService;

public class GenerateShippingLabelCommand implements Command {
    private String orderId;
    private ShippingService shippingService;

    public GenerateShippingLabelCommand(String orderId, ShippingService shippingService) {
        this.orderId = orderId;
        this.shippingService = shippingService;
    }

    @Override
    public void execute() {
        shippingService.generateShippingLabel(orderId);
    }

    @Override
    public void undo() {
        shippingService.undoGenerateShippingLabel(orderId);
    }
}