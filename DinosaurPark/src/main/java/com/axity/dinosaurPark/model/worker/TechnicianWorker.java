package com.axity.dinosaurPark.model.worker;

/**
 * Definde a un trabajador técnico
 **/
public class TechnicianWorker extends Worker 
{
    
    public TechnicianWorker(int id, String nombre)
    {
        super(id, nombre, 90.0, WorkerJob.TECHNICIAN);
    }
    
}
