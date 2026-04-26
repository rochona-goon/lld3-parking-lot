package Services.Ticket;

import Enums.SlotState;
import Enums.VehicleType;
import Exceptions.GateNotFoundException;
import Exceptions.InvalidParkingLot;
import Exceptions.ParkingSlotNotAvailable;
import Models.*;
import Repositories.GateRepository;
import Repositories.ParkingLotRepository;
import Repositories.TicketRepository;
import Repositories.VehicleRepository;
import Strategies.SlotAssignment.SlotAssignmentStrategy;

import java.util.Date;
import java.util.Optional;

public class TicketServiceImpl extends TicketService{

    TicketRepository ticketRepo;
    GateRepository gateRepo;
    ParkingLotRepository parkingLotRepo;
    VehicleRepository vehicleRepo;
    SlotAssignmentStrategy slotAssignmentStrategy;

    public TicketServiceImpl(TicketRepository ticketRepo,
                             GateRepository gateRepo,
                             ParkingLotRepository parkingLotRepo,
                             VehicleRepository vehicleRepo,
                             SlotAssignmentStrategy slotAssignmentStrategy) {

        this.ticketRepo = ticketRepo;
        this.gateRepo = gateRepo;
        this.parkingLotRepo = parkingLotRepo;
        this.vehicleRepo = vehicleRepo;
        this.slotAssignmentStrategy = slotAssignmentStrategy;
    }

    @Override
    public Ticket issueTicket(int gateId,
                              String vehicleNumber,
                              String ownerName,
                              VehicleType vehicleType) {

        // validations is a must.

        Optional<Gate> optGate = gateRepo.findByGateId(gateId);
        if(optGate.isEmpty()){
            throw new GateNotFoundException("Invalid Gate Number.");
        }
        Gate gate = optGate.get();

        Optional<ParkingLot> optParkingLot = parkingLotRepo.findByParkingLotByGateId(gateId);

        if(optParkingLot.isEmpty()){
            throw new InvalidParkingLot("Invalid Parking Lot ID.");
        }
        ParkingLot parkingLot = optParkingLot.get();

        Optional<Vehicle> optVehicle = vehicleRepo.findByNumberPlate(vehicleNumber);
        Vehicle vehicle;

        if(optVehicle.isEmpty()){
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(vehicleNumber);
            vehicle.setVehicleType(vehicleType);
            vehicle.setOwnerName(ownerName);

            vehicleRepo.save(vehicle);
        }else{
            vehicle = optVehicle.get();
        }

        // Assign the vehicle to a slot.
        Optional<ParkingSlot> optAssignedSlot = slotAssignmentStrategy.assignSlot(parkingLot,vehicleType);

        if(optAssignedSlot.isEmpty()){
            throw  new ParkingSlotNotAvailable("Parking slot not available.");
        }

        ParkingSlot assignedSlot = optAssignedSlot.get();
        assignedSlot.setSlotstate(SlotState.FILLED);

        Ticket ticket = new Ticket();
        ticket.setVehicle(vehicle);
        ticket.setEntryGate(gate);
        ticket.setSlot(assignedSlot);
        ticket.setOperatorName(gate.getOperator().getOperatorName());
        ticket.setEntryTime(new Date());


        return this.ticketRepo.saveTicket(ticket);

    }
}
