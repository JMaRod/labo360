package com.axity.dinosaurPark.model.tourist;

import java.util.ArrayList;
import java.util.List;

/**
* Clase que modela a un visitante del parque
**/
public class Tourist
{
    private final int id;
    private final String name;
    private TouristStatus status;
    private double moneySpent;
    private final List<String> visitedZones;

    public Tourist(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.status = TouristStatus.OUT_PARK;
        this.moneySpent = 0.0;
        this.visitedZones = new ArrayList<String>();
        
    }
    
    public void spend(double moneyToAdd)
    {
        moneySpent+= moneyToAdd;
    }
    
    public void recordVisit(String zoneToAdd)
    {
        visitedZones.add(zoneToAdd);
    }

    public int getId()
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public TouristStatus getStatus()
    {
        return status;
    }

    public double getMoneySpent()
    {
        return moneySpent;
    }

    public List<String> getVisitedZones()
    {
        return visitedZones;
    }
    
    public void setStatus(TouristStatus status)
    {
        this.status= status;
    }
    
    
}
