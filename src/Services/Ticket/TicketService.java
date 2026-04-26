package Services.Ticket;

import Enums.VehicleType;
import Models.Ticket;

public abstract class TicketService {

    public abstract Ticket issueTicket(int gateId, String vehicleNumber,
                                       String ownerName, VehicleType vehicleType);
}
