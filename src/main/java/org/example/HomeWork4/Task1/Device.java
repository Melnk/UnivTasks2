package org.example.HomeWork4.Task1;

// Абстрактный класс "Device"
abstract class Device {
    protected String name;
    protected DeviceStatus status;

    // Конструктор по умолчанию
    public Device() {
        this("Unknown Device", DeviceStatus.OFF);
    }

    // Основной конструктор
    public Device(String name, DeviceStatus status) {
        this.name = name;
        this.status = status;
    }

    // Метод включения устройства
    public void turnOn() {
        status = DeviceStatus.ON;
        System.out.println(name + " is now ON.");
    }

    // Метод выключения устройства
    public void turnOff() {
        status = DeviceStatus.OFF;
        System.out.println(name + " is now OFF.");
    }

    // Абстрактный метод, который должен быть реализован в подклассах
    public abstract void performFunction();
}