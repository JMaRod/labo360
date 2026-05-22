package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.model.tourist.Tourist;
import java.util.Random;

/**
 * Zona de Baños
 */
public class BathroomZone extends ParkZone
{ 
    private final int maxCapacity;
    int useDuration;

    public BathroomZone()
    {
        super("Bathroom", 0);
        this.maxCapacity = parkConfig.getInt("park.BathroomZone.capacity", 0);
        useDuration= parkConfig.getInt("park.bathroom.useDurationSteps", 5);
    }
    
    
    @Override
    boolean hasCapacity()
    {
        return getCurrentOcupancy()<maxCapacity;
    }

    @Override
    public int getMaxCapacity()
    {
        return this.maxCapacity;
    }

    @Override
    void enter(Tourist tourist)
    {
        if(hasCapacity())
        {   
            tourist.recordVisit(this.getName());
            addCurrentOccupancy();
            tourist.spend(parkConfig.getDouble("park.BathroomZone.price", 5.0));
        }
    }

    @Override
    void exit(Tourist tourist)
    {
        subCurrentOccupancy();
    }
    
}
