package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.model.tourist.Tourist;
import java.util.Random;

/**
 * Recinto central 
 */
public class CentralHub extends ParkZone
{
    private final int maxCapacity;
    private  double souvenirProbability;

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
    
    public void visit(Tourist tourist, Random random)
    {
        enter(tourist);
        
        souvenirProbability=random.nextDouble();
        
        if(souvenirProbability<0.7)
        {
            System.out.println("compro un souvenir");
            tourist.spend(15.0);
        }
        
        
        exit(tourist);
    }
    
}
