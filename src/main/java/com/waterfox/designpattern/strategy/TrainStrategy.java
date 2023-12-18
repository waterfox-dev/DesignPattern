package com.waterfox.designpattern.strategy;

public class TrainStrategy implements ItineraryStrategy
{

    @Override
    public Object route(int start, int end)
    {
        System.out.printf("From point %d to point %d in Train \n", start, end);
        return this.getClass();
    }
}
