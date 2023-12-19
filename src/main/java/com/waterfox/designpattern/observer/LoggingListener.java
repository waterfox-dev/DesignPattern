package com.waterfox.designpattern.observer;

public class LoggingListener implements EventListener
{
    @Override
    public void update(String message)
    {
        System.out.printf("[LOG] - %s \n", message);
    }
}
