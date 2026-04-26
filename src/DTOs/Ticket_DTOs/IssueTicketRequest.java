package DTOs.Ticket_DTOs;

import Enums.VehicleType;

public class IssueTicketRequest {
    private int gateId;
    private String vehicleNumber;
    private VehicleType vehicleType;
    private String ownerName;

    public IssueTicketRequest(int gateId, String vehicleNumber, String ownerName, VehicleType vehicleType) {
        this.gateId = gateId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.ownerName = ownerName;
    }

    public int getGateId() {
        return gateId;
    }

    public void setGateId(int gateId) {
        this.gateId = gateId;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
