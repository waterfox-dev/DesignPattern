package com.waterfox.designpattern.command;

import java.util.Collection;

public class Remote
{
    private Command command;

    public void setCommand(Command c)
    {
        this.command = c;
    }

    public void pressButton()
    {
        this.command.execute();
    }
}
