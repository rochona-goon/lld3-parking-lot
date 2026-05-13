package Strategies.Pricing;

import java.util.Date;

public class TruckPricingStrategy extends PricingStrategy{

    @Override
    public long priceAmount(Date entryTime, Date exitTime) {
        long diffInMillis = exitTime.getTime() - entryTime.getTime();
        long hours = (long) Math.ceil(diffInMillis / (1000.0 * 60 * 60));

//      For TRUCKs: Hours spent Price per hour 0-2 50 2-4 60 4-6 65 6 onwards 80

        if (hours <= 2) {
            return hours * 50;
        } else if (hours <= 4) {
            return (2 * 50) + (hours - 2) * 60;
        } else if (hours <= 6) {
            return (2 * 50) + (2 * 50) + (hours - 4) * 65;
        }

        return (2 * 50) + (2 * 60) + (2 * 65) + (hours - 6) * 80;
    }
}
