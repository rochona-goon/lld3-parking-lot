package Repositories.Payment;

import Models.Bill;
import Models.Payment;

import java.util.HashMap;
import java.util.Optional;

public class InMemoryPaymentRepo implements PaymentRepository{
    private HashMap<String, Payment> paymentsMap;
    private static int idCounter = 0;

    public InMemoryPaymentRepo(){
        this.paymentsMap = new HashMap<>();
    }
    @Override
    public Optional<Payment> findPaymentByBillId(int billId) {
        return Optional.empty();
    }

    @Override
    public Optional<Payment> findPaymentById(String paymentId) {
        return Optional.ofNullable(this.paymentsMap.get(paymentId));
    }

    @Override
    public Payment savePayment(Payment payment) {
        if(payment.getPaymentID() == null || payment.getPaymentID().isEmpty()){
            payment.setPaymentID("PAYMENT_"+(++idCounter));
        }
        this.paymentsMap.put(payment.getPaymentID(), payment);
        return payment;
    }
}
