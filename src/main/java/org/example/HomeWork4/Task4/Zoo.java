package org.example.HomeWork4.Task4;

import java.util.ArrayList;
import java.util.List;

class Zoo {
    private List<Animal> animals = new ArrayList<>();

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    public void makeAllSounds() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void feedAll(String foodType) {
        for (Animal animal : animals) {
            animal.eat(foodType);
        }
    }
}