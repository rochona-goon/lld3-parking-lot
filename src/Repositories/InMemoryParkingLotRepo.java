package Repositories;

import Models.ParkingLot;

import java.util.Optional;

public class InMemoryParkingLotRepo implements ParkingLotRepository{
    @Override
    public Optional<ParkingLot> findByParkingLotId(int parkingLotId) {
        return null;
    }

    @Override
    public Optional<ParkingLot> findByParkingLotByGateId(int gateId) {
        return Optional.empty();
    }

    @Override
    public ParkingLot save(ParkingLot parkingLot) {
        return null;
    }
}
