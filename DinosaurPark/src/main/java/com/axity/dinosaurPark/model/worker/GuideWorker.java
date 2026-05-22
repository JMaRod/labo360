package com.axity.dinosaurPark.model.worker;

/**
 * Define a un guía del parque
 * */
public class GuideWorker extends Worker
{
    
    public GuideWorker(int id, String nombre)
    {
        super(id, nombre, 80.0, WorkerJob.GUIDES);
    }
    
}
