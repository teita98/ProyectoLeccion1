package com.app.lecc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SkiLiftManager {
    private SkiLift skiLift;

    @Autowired
    public SkiLiftManager(SkiLift skiLift) {
        this.skiLift = skiLift;
    }

    public void startLiftOperations() {
        skiLift.startOperation();
    }

    public void stopLiftOperations() {
        skiLift.stopOperation();
    }
}