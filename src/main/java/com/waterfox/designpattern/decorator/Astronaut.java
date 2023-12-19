package com.waterfox.designpattern.decorator;

public class Astronaut extends Extra
{
    public Astronaut(Rocket rocket)
    {
        super(rocket);
    }

    @Override
    public void launch() {
        System.out.println("I'm Ambre Male on the rocket " + this.extraOfRocket.getClass());
    }
}
