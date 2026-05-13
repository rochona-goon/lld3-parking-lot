package DTOs.Bill_DTOs;

import Models.Bill;

public class GenerateBillResponse {
    private Bill bill;
    private String vehicleNumber;
    private double totalAmount;
    private BillResponseStatus billResponseStatus;

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BillResponseStatus getBillResponseStatus() {
        return billResponseStatus;
    }

    public void setBillResponseStatus(BillResponseStatus billResponseStatus) {
        this.billResponseStatus = billResponseStatus;
    }
}
