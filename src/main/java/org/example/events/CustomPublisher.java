package org.example.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class CustomPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishCustomEvent(String message) {
        System.out.println("publishing event with message " + message);
        applicationEventPublisher.publishEvent(new CustomEvent(this));
    }

}
