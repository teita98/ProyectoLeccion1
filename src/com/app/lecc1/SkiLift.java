package com.app.lecc1;

import org.springframework.stereotype.Component;

@Component
public class SkiLift {
    public void startOperation() {
        System.out.println("Los remontes de esquí de Snow Valley están en funcionamiento.");
    }

    public void stopOperation() {
        System.out.println("Los remontes de esquí de Snow Valley están parados.");
    }
}