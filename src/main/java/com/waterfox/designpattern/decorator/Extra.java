package com.waterfox.designpattern.decorator;

public abstract class Extra extends Rocket
{
    protected Rocket extraOfRocket;

    public Extra(Rocket rocket)
    {
        this.extraOfRocket = rocket;
    }

    @Override
    public void launch()
    {
        this.extraOfRocket.launch();
    }

}
