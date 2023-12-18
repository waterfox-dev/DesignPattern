package com.waterfox.designpattern.state;

public class ProofreadState implements WritingState
{
    @Override
    public WritingState next()
    {
        return new EmbedState();
    }

    @Override
    public WritingState before()
    {
        return new WriteState();
    }
}
