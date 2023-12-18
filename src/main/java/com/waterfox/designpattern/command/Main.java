package com.waterfox.designpattern.command;

public class Main
{
    public static void main(String[] args)
    {
        Remote r = new Remote();
        Light houseLight = new Light();
        r.setCommand(new TurnOffLight(houseLight));
        r.pressButton();
        r.setCommand(new TurnOnLight(houseLight));
        r.pressButton();
    }
}
