package com.waterfox.designpattern.state;

public interface WritingState
{
    public WritingState next();
    public WritingState before();
}
