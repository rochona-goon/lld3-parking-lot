package Repositories;

import Models.ParkingLot;

import java.util.Optional;

public interface ParkingLotRepository {

    Optional<ParkingLot> findByParkingLotId(int parkingLotId);

    Optional<ParkingLot> findByParkingLotByGateId(int gateId);

    ParkingLot save(ParkingLot parkingLot);
}
