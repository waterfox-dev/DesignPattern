package com.waterfox.designpattern.strategy;

public class CarStrategy implements ItineraryStrategy
{

    @Override
    public Object route(int start, int end)
    {
        System.out.printf("From point %d to point %d in Car \n", start, end);
        return this.getClass();
    }
}
