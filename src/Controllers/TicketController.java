package Controllers;

import DTOs.Ticket_DTOs.IssueTicketRequest;
import DTOs.Ticket_DTOs.IssueTicketResponse;
import DTOs.Ticket_DTOs.TicketResponseStatus;
import Models.Ticket;
import Services.Ticket.TicketService;

public class TicketController {

    private TicketService ticketService;

    public TicketController(TicketService ticketService){
        this.ticketService = ticketService;
    }

    public IssueTicketResponse generateTicket(IssueTicketRequest requestDto){
        IssueTicketResponse response = new IssueTicketResponse();
        try{
            Ticket ticket = ticketService.issueTicket(requestDto.getGateId(),
                                                requestDto.getVehicleNumber(),
                                                requestDto.getOwnerName(),
                                                requestDto.getVehicleType());

            response.setTicketId(ticket);
            response.setSlotNumber(ticket.getSlot().getSlotNumber());
            response.setResponseStatus(TicketResponseStatus.SUCCESS);
        } catch (Exception e) {
            response.setResponseStatus(TicketResponseStatus.FAILURE);
        }

        return response;
    }
}
