package com.tatyana;

public class Bus extends Car{

    int passengerSeat;

    public Bus(String name, int number, String color, CarBrand brand, boolean isRunning, int passengerSeat) {
        super(name, number, color, brand, isRunning);
        this.passengerSeat = passengerSeat;

    }
    @Override
    public void move() {
        System.out.println("Bus can move");
    }

    @Override
    public void stop() {
        System.out.println("Bus can stop");
    }

    public void carryPassengers() {
        System.out.println("Bus can carry " + this.passengerSeat + " passengers");
    }
}
