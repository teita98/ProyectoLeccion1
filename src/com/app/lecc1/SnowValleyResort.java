package com.app.lecc1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("SnowValleyResort")
public class SnowValleyResort implements SkiResort {

    @Autowired
    private SkiLiftManager skiLiftManager;

    @Autowired
    private SkiPassService skiPassService;

    public void openResort() {
        System.out.println("La estación de esquí Snow Valley está abierta.");
        skiLiftManager.startLiftOperations();
    }

    public void sellSkiPass(SkiPass skiPass) {
        skiPassService.sellSkiPass(skiPass);
    }

}