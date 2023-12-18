package com.waterfox.designpattern.strategy;

public class Map
{
    private ItineraryStrategy strategy;

    public Map(TransportType t)
    {
        this.setUpStrategy(t);
    }

    private void setUpStrategy(TransportType t)
    {
        switch (t)
        {
            case CAR -> this.strategy = new CarStrategy();
            case TRAIN -> this.strategy = new TrainStrategy();
            case BIKE -> this.strategy = new BikeStrategy();
        }
    }

    public void setTransport(TransportType t)
    {
        this.setUpStrategy(t);
    }

    public Object draw(int A, int B)
    {
        return this.strategy.route(A, B);
    }
}
