
package com.axity.dinosaurPark.model;

public class CarnivoreDinosaur extends Dinosaur
{
    public CarnivoreDinosaur(int id, String name, String species, DinosaurDangerLevel dangerLevel, double feedingCostPerDay)
    {
        super(id, name, species, DinosaurDiet.CARNIVORE, dangerLevel, feedingCostPerDay);
        
    }

}
