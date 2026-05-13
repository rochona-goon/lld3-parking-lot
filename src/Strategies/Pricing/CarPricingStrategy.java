package Strategies.Pricing;

import java.util.Date;

public class CarPricingStrategy extends PricingStrategy{
    @Override
    public long priceAmount(Date entryTime, Date exitTime) {
        long diffInMillis = exitTime.getTime() - entryTime.getTime();
//        long hours = TimeUnit.MILLISECONDS.toHours(diffInMillis);
        long hours = (long) Math.ceil(diffInMillis / (1000.0 * 60 * 60));

//      For CARs: Hours spent Price per hour 0-2 25 2-4 30 4-6 35 6 onwards 45


        if (hours <= 2) {
            return hours * 25;
        } else if (hours <= 4) {
            return (2 * 25) + (hours - 2) * 30;
        } else if (hours <= 6) {
            return (2 * 25) + (2 * 30) + (hours - 4) * 35;
        }

        return (2 * 25) + (2 * 30) + (2 * 35) + (hours - 6) * 45;
    }
}
