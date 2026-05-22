package com.axity.dinosaurPark.monitoring;

import com.axity.dinosaurPark.model.ParkState;

/**
 * Clas para monitorear el parque
 */
public class Monitoring
{
    private static Monitoring instance;

    private Monitoring()
    {
    }
   
    public static Monitoring getInstance()
    {
        if (instance == null)
        {
            instance = new Monitoring();
        }

        return instance;
    }
    
    public void monitor()
    {
        ParkState parkState= ParkState.getInstance();
        
        System.out.println("Estado del parque");
        System.out.println("Hay " +  parkState.getAllDinosaur().size() + " dinosaurios de los cuales");
        System.out.println("\t" +  parkState.getCarnivoreDinosaurList().size() + " son carnivoros");
        System.out.println("\t" +  parkState.getHerbivoreDinosaurList().size() + " son herbivoros");
        System.out.println("");
        System.out.println("Hay " + parkState.getTouristsList().size() + " visitantes");
        System.out.println("");
        System.out.println("Hay " + parkState.getWorkersList().size() +  " trabajadores");

    }
    
}
