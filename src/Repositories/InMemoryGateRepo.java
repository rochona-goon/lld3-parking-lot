package Repositories;

import Models.Gate;

import java.util.Optional;

public class InMemoryGateRepo implements GateRepository{
    @Override
    public Optional<Gate> findByGateId(int gateId) {
        return null;
    }

    @Override
    public Gate save(Gate gate) {
        return null;
    }
}
