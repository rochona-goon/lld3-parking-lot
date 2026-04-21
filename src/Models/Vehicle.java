package Models;

import Enums.VehicleType;

public class Vehicle {
    private String vehicleNumber;
    private String vehicleName;
    private VehicleType vehicleType;

    public Vehicle(String vehicleNumber, String vehicleName, VehicleType vehicleType) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleName = vehicleName;
        this.vehicleType = vehicleType;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
