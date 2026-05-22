package com.axity.dinosaurPark.simulation;

import com.axity.dinosaurPark.model.ParkState;
import com.axity.dinosaurPark.model.dinosaur.CarnivoreDinosaur;
import com.axity.dinosaurPark.model.dinosaur.Dinosaur;
import com.axity.dinosaurPark.model.dinosaur.DinosaurDangerLevel;
import com.axity.dinosaurPark.model.dinosaur.DinosaurDiet;
import com.axity.dinosaurPark.model.dinosaur.HerbivoreDinosaur;
import com.axity.dinosaurPark.model.worker.GuideWorker;
import com.axity.dinosaurPark.model.worker.KepperWorker;
import com.axity.dinosaurPark.model.worker.TechnicianWorker;
import com.axity.dinosaurPark.model.worker.Worker;

/**
 * Valore de incio de la simulación
 */
public class Preparation
{

    ParkState parkState;

    public Preparation()
    {
        this.parkState = ParkState.getInstance();
    }

    public void startConfig()
    {
        Dinosaur cuernos = new HerbivoreDinosaur(1, "cuernos", "Triceratops", DinosaurDangerLevel.MEDIUM, 200);
        parkState.addDinosaurToList(cuernos);
        Dinosaur espinas = new HerbivoreDinosaur(2, "espinas", "Stegosaurus", DinosaurDangerLevel.HIGH, 200);
        parkState.addDinosaurToList(espinas);
        Dinosaur piePqueño = new HerbivoreDinosaur(3, "pie pequeño", "Brachiosaurus", DinosaurDangerLevel.LOW, 600);
        parkState.addDinosaurToList(piePqueño);
        Dinosaur rex = new CarnivoreDinosaur(1, "rex", "T-rex", DinosaurDangerLevel.HIGH, 400);
        parkState.addDinosaurToList(rex);
        Dinosaur carreras = new CarnivoreDinosaur(1, "carreras", "Velociraptor", DinosaurDangerLevel.HIGH, 100);
        parkState.addDinosaurToList(carreras);
        Dinosaur aleta = new CarnivoreDinosaur(1, "aleta", "Spinosaurus", DinosaurDangerLevel.HIGH, 200);
        parkState.addDinosaurToList(aleta);
        
        Worker javier= new GuideWorker(1, "Javier");
        parkState.addWorkerToList(javier);
        Worker franco= new TechnicianWorker(2, "Franco");
        parkState.addWorkerToList(franco);
        Worker Teresa= new KepperWorker(3, "Teresa");
        parkState.addWorkerToList(Teresa);
    }

}
