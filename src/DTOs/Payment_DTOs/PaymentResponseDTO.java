package DTOs.Payment_DTOs;

import Models.Payment;

public class PaymentResponseDTO {
    private String paymentId;
    private long paidAmount;
    private PaymentResponseStatus paymentStatus;

    public String getPaymentId() {
        return paymentId;
    }

    public void setPayment(String paymentId) {
        this.paymentId = paymentId;
    }

    public long getPaidAmount() {
        return paidAmount;
    }

    public void setPaidAmount(long paidAmount) {
        this.paidAmount = paidAmount;
    }

    public PaymentResponseStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentResponseStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }
}


