
package com.axity.dinosaurPark.model;

public class OmnivoreDinosaur extends Dinosaur
{
    
    public OmnivoreDinosaur(int id, String name, String species, DinosaurDangerLevel dangerLevel, double feedingCostPerDay)
    {
        super(id, name, species, DinosaurDiet.OMNIVORE, dangerLevel, feedingCostPerDay);
    }
    
}
