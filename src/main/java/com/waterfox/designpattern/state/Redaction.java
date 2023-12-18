package com.waterfox.designpattern.state;

public class Redaction
{
    public WritingState state;

    public Redaction()
    {
        this.state = new WriteState();
    }

    public void after(boolean valid)
    {
        if(valid)
        {
            this.state = state.next();
        }
        else
        {
            this.state = state.before();
        }
    }
}
