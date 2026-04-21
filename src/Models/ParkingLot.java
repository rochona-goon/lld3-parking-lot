package Models;

import Enums.ParkingLotState;
import Strategies.SlotAssignmentStrategy;

import java.util.List;

public class ParkingLot extends BaseEntity{
    private String parkingLotAddress;
    private List<ParkingLevel> parkingLevels;
    private List<Gate> gates;
    private ParkingLotState parkingLotState;
    private SlotAssignmentStrategy slotAssignmentStrategy;
    // PricingStrategy

//    public ParkingLot(String parkingLotAddress,
//                      List<ParkingLevel> parkingLevels,
//                      List<Gate> gates) {
//
//        this.parkingLotAddress = parkingLotAddress;
//        this.parkingLevels = parkingLevels;
//        this.gates = gates;
//        this.parkingLotState = ParkingLotState.OPEN;
//    }


    public String getParkingLotAddress() {
        return parkingLotAddress;
    }

    public void setParkingLotAddress(String parkingLotAddress) {
        this.parkingLotAddress = parkingLotAddress;
    }

    public List<ParkingLevel> getParkingLevels() {
        return parkingLevels;
    }

    public void setParkingLevels(List<ParkingLevel> parkingLevels) {
        this.parkingLevels = parkingLevels;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }

    public ParkingLotState getParkingLotState() {
        return parkingLotState;
    }

    public void setParkingLotState(ParkingLotState parkingLotState) {
        this.parkingLotState = parkingLotState;
    }

    public SlotAssignmentStrategy getSlotAssignmentStrategy() {
        return slotAssignmentStrategy;
    }

    public void setSlotAssignmentStrategy(SlotAssignmentStrategy slotAssignmentStrategy) {
        this.slotAssignmentStrategy = slotAssignmentStrategy;
    }
}
