package com.axity.dinosaurPark.model.dinosaur;

/**
 * Clase abstracta que modela a un dinosaurio
 **/
public abstract class Dinosaur
{
    private final int id;
    private final String name;
    private final String species;
    private DinosaurStatus status;  
    private final DinosaurDiet diet;
    private final DinosaurDangerLevel dangerLevel;
    private final double feedingCostPerDay;
    
    public Dinosaur(int id, String name, String species, DinosaurDiet diet, DinosaurDangerLevel dangerLevel, double feedingCostPerDay)
    {
        this.id = id;
        this.name = name;
        this.species = species;
        this.diet= diet;
        this.status= DinosaurStatus.IN_ENCLOSURE;
        this.dangerLevel= dangerLevel;
        this.feedingCostPerDay = feedingCostPerDay;
    }       
    
    // Métodos comunes para todos los dinosaurios
    public DinosaurDiet getDinosaurDiet()
    {
        return this.diet;
    }
    
    public DinosaurDangerLevel getDinosaurDangerLevel()
    {
        return this.dangerLevel;
    }
    
    public DinosaurStatus getDinosaurStatus()
    {
        return this.status;
    }
    
    //Estos metódos definen el estado de un dinosaurio 
    public void escape()           
    { 
        status = DinosaurStatus.ESCAPED;     
    }
    
    public void recapture()        
    { 
        status = DinosaurStatus.IN_ENCLOSURE;  
    }
    
    @Override
    public String toString()
    {
        return "Dinosaurio{" + "id=" + id + ", nombre=" + name + ", especie=" + species + ", estado=" + status + ", dieta=" + diet + ", nivel de peligor=" + dangerLevel + ", costo de alimentación por día=" + feedingCostPerDay + '}';
    }
    
    
}
