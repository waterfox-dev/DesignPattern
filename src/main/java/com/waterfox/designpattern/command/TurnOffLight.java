package com.waterfox.designpattern.command;

public class TurnOffLight implements Command
{
    private Light light;

    public TurnOffLight(Light l)
    {
        this.light = l;
    }

    @Override
    public void execute()
    {
        this.light.turnOff();
    }

}
