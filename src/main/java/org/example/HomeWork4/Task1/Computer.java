package org.example.HomeWork4.Task1;

// Подкласс "Computer"
class Computer extends Device {
    private String operatingSystem;

    // Конструктор по умолчанию
    public Computer() {
        this("Generic Computer", DeviceStatus.OFF, "Unknown OS");
    }

    // Основной конструктор
    public Computer(String name, DeviceStatus status, String operatingSystem) {
        super(name, status);
        this.operatingSystem = operatingSystem;
    }

    // Реализация абстрактного метода
    @Override
    public void performFunction() {
        System.out.println(name + " is running " + operatingSystem + ".");
    }

    // Переопределение метода включения
    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println(name + " is booting up...");
    }
}
