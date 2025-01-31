package org.example.Tasks9.Tasks5;

class Dog extends Animal {
    String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}