
package com.axity.dinosaurPark.model;

import java.util.ArrayList;
import java.util.List;

public class Tourist
{
    private final int id;
    private final String name;
    private TouristStatus status;
    private double moneySpent;
    private List<String> visitedZones;

    public Tourist(int id, String name)
    {
        this.id = id;
        this.name = name;
        this.status = TouristStatus.WAITING;
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
}
