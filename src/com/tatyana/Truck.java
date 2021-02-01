package com.tatyana;

public class Truck extends Car {

    double capacity;

    public Truck(String name, int number, String color, CarBrand brand, boolean isRunning, double capacity) {
        super(name, number, color, brand, isRunning);
        this.capacity = capacity;

    }
    @Override
    public void move() {
        System.out.println("Truck can move");
    }

    @Override
    public void stop() {
        System.out.println("Truck can stop");
    }

    public void lift() {
        System.out.println("Truck can lift load of " + this.capacity + " tons");
    }
}