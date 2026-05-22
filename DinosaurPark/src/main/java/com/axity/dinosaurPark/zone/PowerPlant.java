package com.axity.dinosaurPark.zone;

import com.axity.dinosaurPark.config.ParkConfig;

/**
 * Palnta de energía
 */
public class PowerPlant
{
    private double dailyOperativeCost;
    private PowerPlantStatus powerPlantStatus;
    private final ParkConfig parkConfig= ParkConfig.getInstance();

    public PowerPlant()
    {
        this.dailyOperativeCost = parkConfig.getDouble("park.PowerPlantCost.DailyOperativeCost", 80);
        this.powerPlantStatus = PowerPlantStatus.NORMAL;
    }

    public PowerPlantStatus getPowerPlantStatus()
    {
        return powerPlantStatus;
    }

    public void setPowerPlantStatus(PowerPlantStatus powerPlantStatus)
    {
        this.powerPlantStatus = powerPlantStatus;
    }

    public double getDailyOperativeCost()
    {
        return dailyOperativeCost;
    }
    
    
    
    
}
