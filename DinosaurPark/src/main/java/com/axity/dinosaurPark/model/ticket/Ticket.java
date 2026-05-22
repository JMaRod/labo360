package com.axity.dinosaurPark.model.ticket;

/**
 * Ticket del parque
 */
public class Ticket
{
    private final long id;
    private final int touristId;
    private final double price;

    public Ticket(long id, int touristId, double price)
    {
        this.id = id;
        this.touristId = touristId;
        this.price = price;
    }

    public long getId()
    {
        return id;
    }

    public int getTouristId()
    {
        return touristId;
    }

    public double getPrice()
    {
        return price;
    }
    
}
