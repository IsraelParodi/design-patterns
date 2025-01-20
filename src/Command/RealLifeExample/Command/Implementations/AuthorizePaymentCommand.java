package Command.RealLifeExample.Command.Implementations;

import Command.RealLifeExample.Command.Command;
import Command.RealLifeExample.Receivers.PaymentService;

public class AuthorizePaymentCommand implements Command {
    private String orderId;
    private PaymentService paymentService;

    public AuthorizePaymentCommand(String orderId, PaymentService paymentService) {
        this.orderId = orderId;
        this.paymentService = paymentService;
    }

    @Override
    public void execute() {
        paymentService.authorizePayment(orderId);
    }

    @Override
    public void undo() {
        paymentService.undoAuthorizePayment(orderId);
    }
}