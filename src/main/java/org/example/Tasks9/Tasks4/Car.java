package org.example.Tasks9.Tasks4;

class Car implements Vehicle {
    private int speed;

    @Override
    public void start() {
        System.out.println("Машина завелась.");
    }

    @Override
    public void stop() {
        System.out.println("Машина остановилась.");
    }

    @Override
    public void speedUp(int increment) {
        speed += increment;
        System.out.println("Машина разогналась до " + speed + " км/ч.");
    }
}
