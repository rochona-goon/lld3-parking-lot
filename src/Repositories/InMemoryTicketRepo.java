package Repositories;

import Models.Ticket;

import java.util.HashMap;
import java.util.Optional;

public class InMemoryTicketRepo implements TicketRepository{
    private HashMap<Integer, Ticket> ticketsMap;
    private static int idCounter = 0;

    public InMemoryTicketRepo(){
        this.ticketsMap = new HashMap<>();
    }

    @Override
    public Optional<Ticket> fetchTicketById(int ticketNumber) {
        return Optional.ofNullable(this.ticketsMap.get(ticketNumber));
    }

    @Override
    public Ticket saveTicket(Ticket ticket) {
        if(ticket.getTicketNumber() == 0){
            ticket.setTicketNumber(++idCounter);
        }
        this.ticketsMap.put(ticket.getTicketNumber(), ticket);
        return ticket;
    }

}
