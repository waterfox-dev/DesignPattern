package com.waterfox.designpattern.observer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EventManager
{
    private HashMap<EventType, List<EventListener>> listeners = new HashMap<>();

    public EventManager(EventType... operations)
    {
        for(EventType eventType : operations)
        {
            this.listeners.put(eventType, new ArrayList<>());
        }
    }

    public void subscribe(EventType eventType, EventListener listener)
    {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void unsubscribe(EventType eventType, EventListener listener)
    {
        List<EventListener> users = listeners.get(eventType);
        users.add(listener);
    }

    public void notify(EventType eventType, String msg)
    {
        List<EventListener> users =  listeners.get(eventType);
        for(EventListener eventListener : users)
        {
            eventListener.update(msg);
        }
    }
}
