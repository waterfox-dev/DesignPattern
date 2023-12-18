package com.waterfox.designpattern.strategy.test;

import com.waterfox.designpattern.strategy.*;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MapTest
{
    @Test
    public void testCar()
    {
        Map m = new Map(TransportType.CAR);
        assertEquals(m.draw(1,2), CarStrategy.class);
    }

    @Test
    public void testTrain()
    {
        Map m = new Map(TransportType.TRAIN);
        assertEquals(m.draw(1,2), TrainStrategy.class);
    }

    @Test
    public void testBike()
    {
        Map m = new Map(TransportType.BIKE);
        assertEquals(m.draw(1,2), BikeStrategy.class);
    }
}