package Strategies.SlotAssignment;

import Enums.FloorState;
import Enums.SlotState;
import Enums.VehicleType;
import Exceptions.ParkingSlotNotAvailable;
import Models.ParkingLevel;
import Models.ParkingLot;
import Models.ParkingSlot;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FarthestSlotAssignmentStrategy implements SlotAssignmentStrategy{
    @Override
    public Optional<ParkingSlot> assignSlot(ParkingLot parkingLot, VehicleType vehicleType) {

        // Get list of all parking floors of the parkingLot.
        List<ParkingLevel> levels = parkingLot.getParkingLevels();


        // Get the best parking floor that has the least number of available slots.
        Optional<ParkingLevel> optBestFloor = levels.stream()
                .filter(f -> f.getFloorState().equals(FloorState.OPERATIONAL))
                .filter(l -> l.getSlots().stream()
                        .anyMatch(s -> s.getAllowedVehicles().equals(vehicleType) &&
                         s.getSlotstate().equals(SlotState.EMPTY)))
                        .min(Comparator.comparing((ParkingLevel f) -> f.getSlots().stream()
                                .filter(s -> s.getAllowedVehicles().equals(vehicleType) &&
                                 s.getSlotstate().equals(SlotState.EMPTY)).count())
                                .thenComparingInt(ParkingLevel::getLevelNumber));

        if(optBestFloor.isEmpty()){
            throw new ParkingSlotNotAvailable("Parking Slots not Available.");
        }
        ParkingLevel bestFloor = optBestFloor.get();

        // Find the farthest spot available of the selected floor
        Optional<ParkingSlot> optFarthestSlot = bestFloor.getSlots().stream()
                .filter(s -> s.getAllowedVehicles().equals(vehicleType) &&
                        s.getSlotstate().equals(SlotState.EMPTY))
                .max(Comparator.comparingInt(ParkingSlot::getSlotNumber));

        return optFarthestSlot;
    }
}
