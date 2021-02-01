package com.tatyana;

public class Main {

    public static void main(String[] args) {

	Car myCar = new Car("Tanya", 1015, "grey", CarBrand.TOYOTA, true);
	myCar.move();
	myCar.stop();
	System.out.println(myCar.toString());

	Truck volvo = new Truck("Alex", 345, "green", CarBrand.VOLVO, true, 20);
	volvo.move();
	volvo.stop();
	volvo.lift();

	Bus travelBus = new Bus("John", 123, "blue", CarBrand.MERCEDES, true, 60);
	travelBus.move();
	travelBus.stop();
	travelBus.carryPassengers();
    }
}
