package com.app.lecc1;

public class SkiReservation {
    private SkiPass skiPass;
    private int reservationNumber;

    public SkiReservation(SkiPass skiPass, int reservationNumber) {
        this.skiPass = skiPass;
        this.reservationNumber = reservationNumber;
    }

    public SkiPass getSkiPass() {
        return skiPass;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }
}