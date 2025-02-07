package org.example.HomeWork4.Task1;

// Подкласс "Smartphone"
class Smartphone extends Device {
    private String carrier;

    // Конструктор по умолчанию
    public Smartphone() {
        this("Generic Smartphone", DeviceStatus.OFF, "Unknown Carrier");
    }

    // Основной конструктор
    public Smartphone(String name, DeviceStatus status, String carrier) {
        super(name, status);
        this.carrier = carrier;
    }

    // Реализация абстрактного метода
    @Override
    public void performFunction() {
        System.out.println(name + " is connected to " + carrier + " network.");
    }

    // Переопределение метода включения
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is starting mobile services...");
    }
}