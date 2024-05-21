package com.anudip.labtwo;

class Animal {
 public void move() {
     System.out.println("The animal moves");
 }

 public void makeSound() {
     System.out.println("The animal makes a sound");
 }
}

class Bird extends Animal {
 @Override
 public void move() {
     System.out.println("The bird flies");
 }

 @Override
 public void makeSound() {
     System.out.println("The bird chirps");
 }
}

class Panthera extends Animal {
 @Override
 public void move() {
     System.out.println("The panthera prowls");
 }

 @Override
 public void makeSound() {
     System.out.println("The panthera roars");
 }
}

public class AnimalTest {
 public static void main(String[] args) {
     Animal bird = new Bird();
     Animal panthera = new Panthera();

     
     bird.move();
     bird.makeSound();

     panthera.move();
     panthera.makeSound();
 }
}
