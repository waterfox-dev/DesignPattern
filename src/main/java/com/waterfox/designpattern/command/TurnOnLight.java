package com.waterfox.designpattern.command;

public class TurnOnLight implements Command
{
    private Light light;

    public TurnOnLight(Light l)
    {
        this.light = l;
    }

    @Override
    public void execute()
    {
        this.light.turnOn();
    }
}
