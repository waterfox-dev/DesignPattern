package com.waterfox.designpattern.state;

public class WriteState implements WritingState
{
    @Override
    public WritingState next()
    {
        return new ProofreadState();
    }

    @Override
    public WritingState before()
    {
        return null;
    }
}
