
package com.axity.dinosaurPark.model;

public class HerbivoreDinosaur extends Dinosaur
{
    
    public HerbivoreDinosaur(int id, String name, String species, DinosaurDangerLevel dangerLevel, double feedingCostPerDay)
    {
        super(id, name, species, DinosaurDiet.HERBIVORE, dangerLevel, feedingCostPerDay);
    }
    
}
