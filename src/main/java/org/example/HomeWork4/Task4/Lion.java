package org.example.HomeWork4.Task4;

class Lion implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Lion roars!");
    }

    @Override
    public void eat(String foodType) {
        System.out.println("Lion eats " + foodType);
    }

    public void hunt() {
        System.out.println("Lion is hunting...");
    }
}