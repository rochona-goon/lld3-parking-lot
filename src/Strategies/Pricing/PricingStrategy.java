package Strategies.Pricing;

import java.util.Date;

public abstract class PricingStrategy {
    public abstract long priceAmount(Date entryTime, Date exitTime);
}
