package com.axity.dinosaurPark.model;

import com.axity.dinosaurPark.model.dinosaur.CarnivoreDinosaur;
import com.axity.dinosaurPark.model.dinosaur.Dinosaur;
import com.axity.dinosaurPark.model.dinosaur.DinosaurDiet;
import com.axity.dinosaurPark.model.dinosaur.HerbivoreDinosaur;
import com.axity.dinosaurPark.model.tourist.Tourist;
import com.axity.dinosaurPark.model.worker.GuideWorker;
import com.axity.dinosaurPark.model.worker.KepperWorker;
import com.axity.dinosaurPark.model.worker.TechnicianWorker;
import com.axity.dinosaurPark.model.worker.Worker;
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
    private final List<Worker> allWorkersList;
    private final List<GuideWorker> guideWorkerList;
    private final List<TechnicianWorker> technicianWorkersList;
    private final List<KepperWorker> kepperWorkersList;
    private final List<Tourist> touristsList;
    
    private ParkState()
    {
        herbivoreDinosaurList= new ArrayList<>();
        carnivoreDinosaurList= new ArrayList<>();
        allDinosaurList= new ArrayList<>();
        allWorkersList= new ArrayList<>();
        guideWorkerList= new ArrayList<>();
        technicianWorkersList= new ArrayList<>();
        kepperWorkersList= new ArrayList<>();
        touristsList= new ArrayList<>();
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

    public List<Dinosaur> getAllDinosaurList()
    {
        return allDinosaurList;
    }
    
    private void createAllWorkerList()
    {
        allWorkersList.clear();
        allWorkersList.addAll(guideWorkerList);
        allWorkersList.addAll(technicianWorkersList);
        allWorkersList.addAll(kepperWorkersList);
    }
    
    public List<Worker> getAllWorkers()
    {
        return allWorkersList;
    }
    
    public void addWorkerToList(Worker newWorker)
    {
        switch (newWorker.getJob())
        {
            case GUIDES:
                guideWorkerList.add((GuideWorker) newWorker);
                break;
            case TECHNICIAN:
                technicianWorkersList.add((TechnicianWorker) newWorker);
                break;
            default:
                kepperWorkersList.add((KepperWorker) newWorker);
                break;
        }
        
        createAllWorkerList();
    }
    
    public List<GuideWorker> getGuidesWorkers()
    {
        return guideWorkerList;
    }
    
    public List<TechnicianWorker> getTechnicianWorkers()
    {
        return technicianWorkersList;
    }
    
    public List<KepperWorker> getKepperWokers()
    {
        return kepperWorkersList;
    }

    public List<Worker> getWorkersList()
    {
        return allWorkersList;
    }

    public List<Tourist> getTouristsList()
    {
        return touristsList;
    }
    
    
    
}
