package org.example.Tasks9.Tasks5;

class Cat extends Animal {
    String color;

    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}