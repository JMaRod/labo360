package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.config.ParkConfig;
import com.axity.dinosaurPark.model.tourist.Tourist;

/**
 * clase abstracta para todas las zonas del parque
 */
public abstract class ParkZone
{
    protected final ParkConfig parkConfig= ParkConfig.getInstance();
    private final String name;
    private int currentOccupancy;

    public ParkZone(String name, int currentOcupancy)
    {
        this.name = name;
        this.currentOccupancy = currentOcupancy;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getCurrentOcupancy()
    {
        return this.currentOccupancy;
    }
    
    public void addCurrentOccupancy()
    {
        this.currentOccupancy+=1;
    }
    
    public void subCurrentOccupancy()
    {
        this.currentOccupancy-=1;
    }
    
    abstract boolean hasCapacity();
    abstract public int getMaxCapacity();
    abstract void enter(Tourist tourist);
    abstract void exit(Tourist tourist);
    
}
