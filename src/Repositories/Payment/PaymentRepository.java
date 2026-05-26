package Repositories.Payment;

import Models.Payment;

import java.util.Optional;

public interface PaymentRepository {

    Optional<Payment> findPaymentByBillId(int billId);

    Optional<Payment> findPaymentById(String paymentId);


    Payment savePayment(Payment payment);
}
