package Strategies;

import Enums.VehicleType;
import Models.ParkingLot;
import Models.ParkingSlot;

public interface SlotAssignmentStrategy {
    ParkingSlot assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
