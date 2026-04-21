package Models;

import java.util.Date;
import java.util.List;

public class Bill extends BaseEntity{
    private Ticket ticket;
    private Gate exitGate;
    private int operatorId;
    private Date exitTime;
    private double amount;
    private List<Payment> payments;


//    public Bill(Ticket ticket, Gate exitGate, double amount) {
//        this.ticket = ticket;
//        this.exitGate = exitGate;
//        this.operatorId = exitGate.getOperator().getId();
//        this.exitTime = new Date();
//        this.amount = amount;
//    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public Gate getExitGate() {
        return exitGate;
    }

    public void setExitGate(Gate exitGate) {
        this.exitGate = exitGate;
    }

    public int getOperatorId() {
        return operatorId;
    }

    public void setOperatorId(int operatorId) {
        this.operatorId = operatorId;
    }

    public Date getExitTime() {
        return exitTime;
    }

    public void setExitTime(Date exitTime) {
        this.exitTime = exitTime;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public List<Payment> getPayments() {
        return payments;
    }

    public void setPayments(List<Payment> payments) {
        this.payments = payments;
    }
}
