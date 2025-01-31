package org.example.Tasks9.Tasks3;

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }

    @Override
    void draw() {
        System.out.println("Рисую круг.");
    }
}