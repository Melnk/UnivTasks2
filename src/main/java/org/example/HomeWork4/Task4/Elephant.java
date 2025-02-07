package org.example.HomeWork4.Task4;

class Elephant implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Elephant trumpets!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Elephant eats " + foodType);
    }

    public void playWater() {
        System.out.println("Elephant is playing with water...");
    }
}