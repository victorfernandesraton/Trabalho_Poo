package app;

import java.util.*;

class Rent{
    private String id;
    private short status;
    private Car car;

    public Rent(Car car) {
        this.car = car;
        this.status = (short) 1;
        Random rand = new Random();
        // gera n aleatório de 7
        this.id = String.valueOf(rand.nextInt(9999999));
    }

    public Rent(String id, short status, Car car) 
    {
        this.id = id;
        this.status = status;
        this.car = car;
    }


    public String getId() 
    {
        return this.id;
    }

    public void setId(String id) 
    {
        this.id = id;
    }

    public short getStatus() 
    {
        return this.status;
    }

    public void setStatus(short status) 
    {
        this.status = status;
    }

    public Car getCar() 
    {
        return this.car;
    }

    public void setCar(Car car) 
    {
        this.car = car;
    }
}