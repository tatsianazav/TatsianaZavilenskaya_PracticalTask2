package com.tatyana;

import java.util.Objects;

public class Car implements Movable {
    protected String name;
    protected int number;
    protected String color;
    protected CarBrand brand;
    protected boolean isRunning;

    public Car(String name, int number, String color, CarBrand brand, boolean isRunning) {
        this.name = name;
        this.number = number;
        this.color = color;
        this.brand = brand;
        this.isRunning = isRunning;
    }

    @Override
    public void move() {
        System.out.println("Car can move");
    }

    @Override
    public void stop() {
        System.out.println("Car can stop");
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, number, color, isRunning);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Car: ")
                .append("name - ").append(this.name + ", ")
                .append("number - ").append(this.number + ", ")
                .append("color - ").append(this.color + ", ")
                .append("isRunning - ").append(this.isRunning + ", ")
                .append("brand - ").append(this.brand);
               return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        Car car = (Car) obj;
        return number == car.number && isRunning == car.isRunning && Objects.equals(name, car.name) && Objects.equals(color, car.color);
    }
}


