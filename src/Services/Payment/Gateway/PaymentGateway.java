package Services.Payment.Gateway;

public interface PaymentGateway {
    PaymentResponse makePayment(long amount, int billId);
}
