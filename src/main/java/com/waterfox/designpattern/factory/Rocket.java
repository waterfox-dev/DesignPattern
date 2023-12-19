package com.waterfox.designpattern.factory;

public abstract class Rocket
{
    public void launch()
    {
        System.out.println(this.getClass() + " - Launch");
    }
}
