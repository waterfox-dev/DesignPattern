package com.waterfox.designpattern.decorator;

public class Satellite extends Extra
{
    public Satellite(Rocket rocket)
    {
        super(rocket);
    }

    @Override
    public void launch() {
        System.out.println("I'm Soyouz satellite in " + extraOfRocket.getClass());
    }
}
