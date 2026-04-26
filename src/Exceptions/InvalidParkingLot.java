package Exceptions;

public class InvalidParkingLot extends RuntimeException {
    public InvalidParkingLot(String message) {
        super(message);
    }
}
