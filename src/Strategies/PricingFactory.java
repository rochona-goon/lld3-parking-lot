package Strategies;

import Enums.VehicleType;
import Strategies.Pricing.BikePricingStrategy;
import Strategies.Pricing.CarPricingStrategy;
import Strategies.Pricing.PricingStrategy;
import Strategies.Pricing.TruckPricingStrategy;

public class PricingFactory {
    public PricingStrategy getPricingStrategy(VehicleType vehicleType){
        if(vehicleType.equals(VehicleType.CAR))
            return new CarPricingStrategy();
        else if(vehicleType.equals(VehicleType.BIKE))
            return new BikePricingStrategy();
        else
            return new TruckPricingStrategy();
    }
}
