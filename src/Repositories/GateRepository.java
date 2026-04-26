package Repositories;

import Models.Gate;

import java.util.Optional;

public interface GateRepository {

    Optional<Gate> findByGateId(int gateId);

    Gate save(Gate gate);
}
