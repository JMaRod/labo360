package com.axity.dinosaurPark.model;

import com.axity.dinosaurPark.model.dinosaur.CarnivoreDinosaur;
import com.axity.dinosaurPark.model.dinosaur.Dinosaur;
import com.axity.dinosaurPark.model.dinosaur.DinosaurDiet;
import com.axity.dinosaurPark.model.dinosaur.HerbivoreDinosaur;
import java.util.ArrayList;
import java.util.List;

/**
 * Es la repesentación de cada uno de los estados del parque, tiene la información 
 * de visitantes en el parque, dinosaurios, recintos etc.
 * Como solamente se tiene un parque, solamente necesitamos un objeto de esta clase
 * por lo que se va a utilizar el patrón singleton.
 */
public class ParkState
{
    private static ParkState instance;
    
    private final List<HerbivoreDinosaur> herbivoreDinosaurList;
    private final List<CarnivoreDinosaur> carnivoreDinosaurList;
    private final List<Dinosaur> allDinosaurList;
    
    private ParkState()
    {
        herbivoreDinosaurList= new ArrayList<>();
        carnivoreDinosaurList= new ArrayList<>();
        allDinosaurList= new ArrayList<>();
    }
    
    public static ParkState getInstance()
    {
        if (instance == null)
        {
            instance = new ParkState();
        }

        return instance;
    }

    public List<HerbivoreDinosaur> getHerbivoreDinosaurList()
    {
        return herbivoreDinosaurList;
    }

    public List<CarnivoreDinosaur> getCarnivoreDinosaurList()
    {
        return carnivoreDinosaurList;
    }

    private void createAllDinosaurList()
    {
        allDinosaurList.clear();
        allDinosaurList.addAll(herbivoreDinosaurList);
        allDinosaurList.addAll(carnivoreDinosaurList);
    }
    
    public List<Dinosaur> getAllDinosaur()
    {
        return allDinosaurList;
    }
    
    public void addDinosaurToList(Dinosaur newDinosaur)
    {
        if(newDinosaur.getDinosaurDiet().equals(DinosaurDiet.HERBIVORE))
        {
            herbivoreDinosaurList.add((HerbivoreDinosaur) newDinosaur);
        }
        else
        {
            carnivoreDinosaurList.add((CarnivoreDinosaur) newDinosaur);
        }
        
        createAllDinosaurList();
    }
    
}
