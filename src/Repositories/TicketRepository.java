package Repositories;

import Models.Ticket;

import java.util.Optional;

public interface TicketRepository {

    Optional<Ticket> fetchTicketById(int ticketNumber);

    Ticket saveTicket(Ticket ticket);

}
