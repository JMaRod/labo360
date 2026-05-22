package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.model.tourist.Tourist;

/**
 * Observatorio de los dinosaurios carnívoros
 */
public class ObservationCarnivore extends ParkZone
{
    private final int maxCapacity;

    public ObservationCarnivore()
    {
        super("Observation Carnivore", 0);
        maxCapacity= parkConfig.getInt("park.ObservationCarnivore.capacity", 10);
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
            tourist.spend(parkConfig.getDouble("park.ObservationCarnivore.cost", 5.0));
        }
    }

    @Override
    void exit(Tourist tourist)
    {
        subCurrentOccupancy();
    }
    
}
