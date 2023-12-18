package com.waterfox.designpattern.state;

public class EmbedState implements WritingState
{
    @Override
    public WritingState next()
    {
        return new BroadcastState();
    }

    @Override
    public WritingState before()
    {
        return null;
    }
}
