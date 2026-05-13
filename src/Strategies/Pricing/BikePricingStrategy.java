package Strategies.Pricing;

import java.util.Date;

public class BikePricingStrategy extends PricingStrategy{
    @Override
    public long priceAmount(Date entryTime, Date exitTime) {
        long diffInMillis = exitTime.getTime() - entryTime.getTime();
//        long hours = TimeUnit.MILLISECONDS.toHours(diffInMillis);
        long hours = (long) Math.ceil(diffInMillis / (1000.0 * 60 * 60));

//      For BIKEs: Hours spent Price per hour 0-2 20 2-4 25 4-6 30 6 onwards 40
        if(hours <= 2){
            return  (hours * 20);
        }else if(hours <= 4){
            return (2 * 20) + (hours - 2) * 25;
        }else if(hours <= 6){
            return (2 * 20) + (2 * 25) + (hours - 4) * 30;
        }

        return (2 * 20) + (2 * 25) + (2 * 30) + (hours - 6) * 40;
    }
}
