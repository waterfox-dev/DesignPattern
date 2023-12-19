package com.waterfox.designpattern.observer;

public class EmailAlertListener implements EventListener
{
    @Override
    public void update(String message)
    {
        System.out.printf("[EMAIL] - %s \n", message);
    }
}
