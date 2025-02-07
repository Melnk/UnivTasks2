package org.example.HomeWork4.Task4;

class Monkey implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Monkey screeches!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Monkey eats " + foodType);
    }

    public void swing() {
        System.out.println("Monkey is swinging on branches...");
    }
}