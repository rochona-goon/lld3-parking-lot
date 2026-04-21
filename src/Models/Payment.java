package Models;

import Enums.PaymentMode;
import Enums.PaymentStatus;

public class Payment{
    private String paymentID;
    private PaymentMode mode;
    private Bill bill;
    private PaymentStatus paymentStatus;
    private double paymentAmount;

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

    public double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }
}
