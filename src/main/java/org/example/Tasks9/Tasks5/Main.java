package org.example.Tasks9.Tasks5;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {new Dog("Rex", 5, "Labrador"), new Cat("Whiskers", 3, "Black")};

        for (Animal animal : animals) {
            System.out.println(animal.name + " says: " + animal.speak());
        }
    }
}