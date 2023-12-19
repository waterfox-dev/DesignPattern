package com.waterfox.designpattern.observer;

public class Editor
{
    public EventManager event;

    public Editor()
    {
        this.event = new EventManager(EventType.CLOSE, EventType.OPEN);
    }

    public void openFile()
    {
        this.event.notify(EventType.OPEN, "Open file");
    }

    public void writeFile()
    {
        this.event.notify(EventType.WRITE, "Write file");
    }

    public void closeFile()
    {
        this.event.notify(EventType.CLOSE, "Close file");
    }
}
