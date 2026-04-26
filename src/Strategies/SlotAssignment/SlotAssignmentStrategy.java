package Strategies.SlotAssignment;

import Enums.VehicleType;
import Models.ParkingLot;
import Models.ParkingSlot;

import java.util.Optional;

public interface SlotAssignmentStrategy {
    Optional<ParkingSlot> assignSlot(ParkingLot parkingLot, VehicleType vehicleType);
}
