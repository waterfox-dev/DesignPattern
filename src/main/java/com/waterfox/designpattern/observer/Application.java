package com.waterfox.designpattern.observer;

import java.util.logging.Logger;

public class Application
{
    public static void main(String[] args)
    {
        Editor e = new Editor();

        LoggingListener log = new LoggingListener();
        e.event.subscribe(EventType.OPEN, log);

        EmailAlertListener email = new EmailAlertListener();
        e.event.subscribe(EventType.CLOSE, email);

        e.openFile();
        e.closeFile();
    }
}
