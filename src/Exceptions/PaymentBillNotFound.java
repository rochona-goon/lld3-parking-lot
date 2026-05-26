package Exceptions;

public class PaymentBillNotFound extends RuntimeException {
    public PaymentBillNotFound(String message) {
        super(message);
    }
}
