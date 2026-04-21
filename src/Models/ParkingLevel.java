package Models;

import Enums.FloorState;

import java.util.List;

public class ParkingLevel extends BaseEntity{
    private int levelNumber;
    private List<ParkingSlot> slots;
    private FloorState floorState;

//    public ParkingLevel(int levelNumber,
//                        int parkingLotId,
//                        List<ParkingSlot> slots,
//                        List<Vehicle> vehicles) {
//
//        this.levelNumber = levelNumber;
//        this.slots = slots;
//        this.floorState = FloorState.AVAILABLE;
//    }

    public int getLevelNumber() {
        return levelNumber;
    }

    public void setLevelNumber(int levelNumber) {
        this.levelNumber = levelNumber;
    }

    public List<ParkingSlot> getSlots() {
        return slots;
    }

    public void setSlots(List<ParkingSlot> slots) {
        this.slots = slots;
    }


    public FloorState getFloorState() {
        return floorState;
    }

    public void setFloorState(FloorState floorState) {
        this.floorState = floorState;
    }
}
