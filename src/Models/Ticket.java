package Models;

import java.util.Date;

public class Ticket extends BaseEntity{
    private int ticketNumber;
    private Vehicle vehicle;
    private Gate entryGate;
    private String operatorName;
    private ParkingSlot slot;
    private Date entryTime;


    public Ticket(int ticketNumber,
                  Vehicle vehicle,
                  Gate entryGate,
                  ParkingSlot slot) {
        this.ticketNumber = ticketNumber;
        this.vehicle = vehicle;
        this.entryGate = entryGate;
        this.operatorName = entryGate.getOperator().getOperatorName();
        this.slot = slot;
        this.entryTime = new Date();
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Gate getEntryGate() {
        return entryGate;
    }

    public void setEntryGate(Gate entryGate) {
        this.entryGate = entryGate;
    }

    public String getOperatorName() {
        return operatorName;
    }

    public void setOperatorName(String operatorName) {
        this.operatorName = operatorName;
    }

    public ParkingSlot getSlot() {
        return slot;
    }

    public void setSlot(ParkingSlot slot) {
        this.slot = slot;
    }

    public Date getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
}
