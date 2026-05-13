package Models;

import Enums.PaymentMode;
import Enums.PaymentStatus;

public class Payment{
    private String paymentID;
    private String transactionId;
    private PaymentMode mode;
    private Bill bill;
    private PaymentStatus paymentStatus;
    private long paymentAmount;

//    public Payment(PaymentMode mode, Bill bill) {
//        this.mode = mode;
//        this.bill = bill;
//        this.paymentStatus = PaymentStatus.INITIATED;
//    }

    public String getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public PaymentMode getMode() {
        return mode;
    }

    public void setMode(PaymentMode mode) {
        this.mode = mode;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public PaymentStatus getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(PaymentStatus paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public long getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(long paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
