package Exceptions;

public class ParkingSlotNotAvailable extends RuntimeException {
    public ParkingSlotNotAvailable(String message) {
        super(message);
    }
}
