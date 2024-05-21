package com.anudip.labtwo;


class Vehicle {
	public void startEngine() {
		System.out.println("The vehicle engine starts.");
	}

	public void stopEngine() {
		System.out.println("The vehicle engine stops.");
	}
}


class Car extends Vehicle {
	@Override
 	public void startEngine() {
     	System.out.println("The car engine starts with a key.");
 	}

 	@Override
 	public void stopEngine() {
     	System.out.println("The car engine stops with a key.");
 	}
}


class Motorcycle extends Vehicle {
	@Override
 	public void startEngine() {
     	System.out.println("The motorcycle engine starts with a button.");
 	}

 	@Override
 	public void stopEngine() {
 		System.out.println("The motorcycle engine stops with a button.");
 	}
}

public class VehicleTest {
	public static void main(String[] args) {

		Vehicle car = new Car();
		System.out.println("Car:");
		car.startEngine();
		car.stopEngine();

		Vehicle motorcycle = new Motorcycle();
		System.out.println("\nMotorcycle:");
     	motorcycle.startEngine();
     	motorcycle.stopEngine();
	}
}
