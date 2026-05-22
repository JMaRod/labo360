package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.model.tourist.Tourist;

/**
 * Observatorio de dinosaurios herbívoros
 */
public class ObservationHerbivore extends ParkZone
{
    private final int maxCapacity;

    public ObservationHerbivore()
    {
        super("Observation Herbivore", 0);
        maxCapacity= parkConfig.getInt("park.ObservationHerbivore.capacity", 10);
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
            tourist.spend(parkConfig.getDouble("park.ObservationHerbivore.cost", 5.0));
        }
    }

    @Override
    void exit(Tourist tourist)
    {
        subCurrentOccupancy();
    }
    
}
