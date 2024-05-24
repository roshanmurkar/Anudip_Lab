package com.anudip.labtwo;

// Parent class representing a generic vehicle
class Vehicle {
    // Method to start the engine of the vehicle
    public void startEngine() {
        System.out.println("The vehicle engine starts.");
    }

    // Method to stop the engine of the vehicle
    public void stopEngine() {
        System.out.println("The vehicle engine stops.");
    }
}

// Subclass representing a car, extending the Vehicle class
class Car extends Vehicle {
    // Override method to start the engine of the car
    @Override
    public void startEngine() {
        System.out.println("The car engine starts with a key.");
    }

    // Override method to stop the engine of the car
    @Override
    public void stopEngine() {
        System.out.println("The car engine stops with a key.");
    }
}

// Subclass representing a motorcycle, extending the Vehicle class
class Motorcycle extends Vehicle {
    // Override method to start the engine of the motorcycle
    @Override
    public void startEngine() {
        System.out.println("The motorcycle engine starts with a button.");
    }

    // Override method to stop the engine of the motorcycle
    @Override
    public void stopEngine() {
        System.out.println("The motorcycle engine stops with a button.");
    }
}

// Main class to test the Vehicle, Car, and Motorcycle classes
public class VehicleTest {
    public static void main(String[] args) {
        // Creating a Car object and testing its methods
        Vehicle car = new Car();
        System.out.println("Car:");
        car.startEngine();
        car.stopEngine();

        // Creating a Motorcycle object and testing its methods
        Vehicle motorcycle = new Motorcycle();
        System.out.println("\nMotorcycle:");
        motorcycle.startEngine();
        motorcycle.stopEngine();
    }
}
