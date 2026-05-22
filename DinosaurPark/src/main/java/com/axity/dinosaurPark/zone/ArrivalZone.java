package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.model.tourist.Tourist;
import com.axity.dinosaurPark.model.tourist.TouristStatus;

/**
 * Zona de llegada
 */
public class ArrivalZone extends ParkZone
{
    private final int maxCapacity;
    
    public ArrivalZone()
    {
        super("Arrival Zone", 0);
        this.maxCapacity= parkConfig.getInt("park.max.capacity", 20);
    }
    
    @Override
    public boolean hasCapacity()
    {
        return getCurrentOcupancy() < maxCapacity;
    }

    @Override
    public int getMaxCapacity()
    {
        return maxCapacity;
    }

    @Override
    public void enter(Tourist tourist)
    {
        if(hasCapacity())
        {   
            tourist.setStatus(TouristStatus.IN_PARK);
            tourist.spend(parkConfig.getDouble("park.admission", 20));
            addCurrentOccupancy();
        }
        
    }

    @Override
    public void exit(Tourist tourist)
    {
        tourist.setStatus(TouristStatus.OUT_PARK);
        subCurrentOccupancy();
        
    }
    
}
