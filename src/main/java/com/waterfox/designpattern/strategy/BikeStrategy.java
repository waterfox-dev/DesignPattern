package com.waterfox.designpattern.strategy;

public class BikeStrategy implements ItineraryStrategy
{
    @Override
    public Object route(int start, int end)
    {
        System.out.printf("From point %d to point %d on Bike\n", start, end);
        return this.getClass();
    }
}
