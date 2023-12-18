package com.waterfox.designpattern.state;

public class BroadcastState implements WritingState
{
    @Override
    public WritingState next()
    {
        return new WriteState();
    }

    @Override
    public WritingState before()
    {
        return null;
    }
}
