package com.waterfox.designpattern.adapter;

public class Adapter implements NewSystem
{

    private OldSystem old;

    public Adapter(OldSystem old)
    {
        this.old = old;
    }

    @Override
    public void newOperation()
    {
        old.legacyOperation();
    }
}
