package Repositories;

import Models.Vehicle;

import java.util.Optional;

public class InMemoryVehicleRepo implements VehicleRepository{
    @Override
    public Optional<Vehicle> findByNumberPlate(String vehicleNumber) {
        return null;
    }

    @Override
    public Vehicle save(Vehicle vehicle) {
        return null;
    }
}
