package Repositories;

import Models.Vehicle;

import java.util.Optional;

public interface VehicleRepository {

    Optional<Vehicle> findByNumberPlate(String vehicleNumber);

    Vehicle save(Vehicle vehicle);
}
