package DTOs.Payment_DTOs;

import Enums.PaymentMode;
import Models.Bill;

public class PaymentRequestDTO {
    private Bill bill;
    private PaymentMode paymentMode;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentMode getPaymentMode() {
        return paymentMode;
    }

    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }
}
