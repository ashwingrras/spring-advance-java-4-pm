package org.example.events_handling;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;

public class ContextClosedEventHandler
        implements ApplicationListener<ContextClosedEvent> {

    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("ContextClosedEvent Received");
    }
}