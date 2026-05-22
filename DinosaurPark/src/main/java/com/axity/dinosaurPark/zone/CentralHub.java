package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.model.tourist.Tourist;
import com.axity.dinosaurPark.model.tourist.TouristStatus;

/**
 * Recinto central 
 */
public class CentralHub extends ParkZone
{
    private final int maxCapacity;

    public CentralHub()
    {
        super("Central Hub", 0);
        this.maxCapacity=parkConfig.getInt("park.CentralHub.capacity", 20);
    }
    
    @Override
    public boolean hasCapacity()
    {
        return getCurrentOcupancy() < maxCapacity;
    }

    @Override
    public int getMaxCapacity()
    {
        return this.maxCapacity;
    }

    @Override
    public void enter(Tourist tourist)
    {
        if(hasCapacity())
        {   
            tourist.recordVisit(this.getName());
            addCurrentOccupancy();
        }
    }

    @Override
    public void exit(Tourist tourist)
    {
        subCurrentOccupancy();
    }
    
}
