package Models;

import Enums.SlotState;
import Enums.SlotType;
import Enums.VehicleType;

import java.util.List;

public class ParkingSlot extends BaseEntity{
    private int slotNumber;
    private VehicleType allowedVehicles;
    private ParkingLevel level;
    private SlotState slotstate;

//    public ParkingSlot(int spotNumber,
//                       Vehicle vehicle,
//                       ParkingLevel level,
//                       SlotType slotType) {
//
//        this.spotNumber = spotNumber;
//        this.level = level;
//        this.slotstate = SlotState.EMPTY;
//        this.slotType = slotType;
//    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public VehicleType getAllowedVehicles() {
        return allowedVehicles;
    }

    public void setAllowedVehicles(VehicleType getAllowedVehicles) {
        this.allowedVehicles = getAllowedVehicles;
    }

    public ParkingLevel getLevel() {
        return level;
    }

    public void setLevel(ParkingLevel level) {
        this.level = level;
    }

    public SlotState getSlotstate() {
        return slotstate;
    }

    public void setSlotstate(SlotState slotstate) {
        this.slotstate = slotstate;
    }
}
