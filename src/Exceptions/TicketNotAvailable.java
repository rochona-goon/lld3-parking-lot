package Exceptions;

public class TicketNotAvailable extends RuntimeException {
    public TicketNotAvailable(String message) {
        super(message);
    }
}
