package com.axity.dinosaurPark.model.worker;

/*
    Modela a un trabajador
*/
public class Worker
{
    private final int id;
    private final String nombre;
    private final double dailySalary;
    private final WorkerJob job;
    
    //Constructor 

    public Worker(int id, String nombre, double dailySalary, WorkerJob job)
    {
        this.id = id;
        this.nombre = nombre;
        this.dailySalary = dailySalary;
        this.job = job;
    }
    
    
    //Métodos definidos para todos los trabajadores

    public int getId()
    {
        return id;
    }

    public String getNombre()
    {
        return nombre;
    }

    public double getDailySalary()
    {
        return dailySalary;
    }

    public WorkerJob getJob()
    {
        return job;
    }

    @Override
    public String toString()
    {
        return "Worker{" + "id=" + id + ", nombre=" + nombre + ", dailySalary=" + dailySalary + ", job=" + job + '}';
    }
    
}
