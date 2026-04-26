package DTOs.Ticket_DTOs;

import Models.Ticket;

public class IssueTicketResponse {
    private Ticket ticket;
    private int slotNumber;
    private TicketResponseStatus  responseStatus;

//    public IssueTicketResponse(int ticketId, int slotNumber, TicketResponseStatus responseStatus) {
//        this.ticketId = ticketId;
//        this.slotNumber = slotNumber;
//        this.responseStatus = responseStatus;
//    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicketId(Ticket ticket) {
        this.ticket = ticket;
    }

    public int getSlotNumber() {
        return slotNumber;
    }

    public void setSlotNumber(int slotNumber) {
        this.slotNumber = slotNumber;
    }

    public TicketResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(TicketResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
