package com.axity.dinosaurPark;


import com.axity.dinosaurPark.model.ParkState;
import com.axity.dinosaurPark.model.dinosaur.Dinosaur;
import com.axity.dinosaurPark.model.dinosaur.DinosaurDangerLevel;
import com.axity.dinosaurPark.model.dinosaur.HerbivoreDinosaur;
import com.axity.dinosaurPark.zone.ArrivalZone;
import com.axity.dinosaurPark.zone.CentralHub;
import com.axity.dinosaurPark.zone.ParkZone;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
    Punto de inicio para la ejecución
*/
@SpringBootApplication
public class DinosaurParkApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(DinosaurParkApplication.class, args);
        
        ParkZone zone= new CentralHub();
        
        System.out.println("naldsf  " + zone.getName() + "  dsaf" + zone.getCurrentOcupancy() + " qreq " + zone.getMaxCapacity());
        
        
        
    }

}
