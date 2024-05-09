package com.app.lecc1;

import org.springframework.stereotype.Component;

@Component
public class SkiPassService {
    private int reservationCounter = 0;

    public void sellSkiPass(SkiPass skiPass) {
        System.out.println("Se ha vendido un pase de esquí de tipo: " + skiPass.getType() + " con duración de " + skiPass.getDuration() + " días.");
    }

}